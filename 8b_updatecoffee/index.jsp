<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // Database connection parameters
    String jdbcURL = "jdbc:mysql://localhost:3306/test";
    String jdbcUser = "root"; // <-- Replace with your DB user
    String jdbcPass = ""; // <-- Replace with your DB password

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String message = "";

    // Process update if form submitted
    if ("POST".equalsIgnoreCase(request.getMethod())) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("coffee_name");
        double price = Double.parseDouble(request.getParameter("price"));

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPass);

            String sql = "UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, name);
            ps.setDouble(2, price);
            ps.setInt(3, id);

            int updated = ps.executeUpdate();
            message = (updated > 0) ? "Updated successfully!" : "No record found with ID: " + id;
        } catch (Exception e) {
            message = "Error: " + e.getMessage();
        } finally {
            try { if (ps != null) ps.close(); } catch (Exception ignored) {}
            try { if (conn != null) conn.close(); } catch (Exception ignored) {}
        }
    }

    // Fetch and display records
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPass);

        String sql = "SELECT * FROM coffee";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
%>

<!DOCTYPE html>
<html>
<head>
    <title>Update Coffee | index.jsp</title>
</head>
<body>
    <h2>Update Coffee Record</h2>
    <form method="post">
        ID to Update: <input type="number" name="id" required><br>
        New Coffee Name: <input type="text" name="coffee_name" required><br>
        New Price: <input type="number" step="0.01" name="price" required><br>
        <input type="submit" value="Update Coffee">
    </form>

    <p style="color:blue;"><%= message %></p>

    <h2>All Coffee Products</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Coffee Name</th>
            <th>Price</th>
        </tr>
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
        out.println("<p style='color:red;'>Error loading coffee records: " + e.getMessage() + "</p>");
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception ignored) {}
        try { if (ps != null) ps.close(); } catch (Exception ignored) {}
        try { if (conn != null) conn.close(); } catch (Exception ignored) {}
    }
%>
