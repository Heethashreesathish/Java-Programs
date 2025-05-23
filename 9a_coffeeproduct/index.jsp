<%@ include file="dbconfig.jsp" %>
<%@ page import="java.sql.*" %>
<html>
<head><title>Coffee Products</title></head>
<body>
    <h2>All Coffee Products</h2>
    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Price</th><th>Action</th></tr>
        <%
            String query = "SELECT * FROM coffee";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
        %>
            <tr>
                <td><%= rs.getInt("id") %></td>
                <td><%= rs.getString("name") %></td>
                <td><%= rs.getDouble("price") %></td>
                <td><a href="delete.jsp?id=<%= rs.getInt("id") %>">Delete</a></td>
            </tr>
        <%
            }
            rs.close();
            stmt.close();
            conn.close();
        %>
    </table>
</body>
</html>
