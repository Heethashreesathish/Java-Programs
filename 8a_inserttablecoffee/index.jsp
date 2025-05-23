<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // DB connection setup
    String jdbcURL = "jdbc:mysql://localhost:3306/test";
    String jdbcUser = "root"; // your DB user
    String jdbcPass = ""; // your DB password

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    // Insert if form submitted
    String method = request.getMethod();
    if ("POST".equalsIgnoreCase(method)) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("coffee_name");
        double price = Double.parseDouble(request.getParameter("price"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPass);
            String insertQuery = "INSERT INTO coffee VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insertQuery);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, price);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            out.println("Insert Error: " + e.getMessage());
        }
    }

    // Display table
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPass);
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT * FROM coffee");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Coffee List</title>
</head>
<body>
    <h2>Add a New Coffee</h2>
    <form method="post">
        ID: <input type="number" name="id" required><br>
        Name: <input type="text" name="coffee_name" required><br>
        Price: <input type="number" step="0.01" name="price" required><br>
        <input type="submit" value="Add Coffee">
    </form>

    <h2>All Coffee Products</h2>
    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Price</th></tr>
        <%
            while (rs.next()) {
        %>
            <tr>
                <td><%= rs.getInt("id") %></td>
                <td><%= rs.getString("coffee_name") %></td>
                <td><%= rs.getDouble("price") %></td>
            </tr>
        <%
            }
        %>
    </table>
</body>
</html>
<%
    } catch (Exception e) {
        out.println("Display Error: " + e.getMessage());
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (stmt != null) stmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>
