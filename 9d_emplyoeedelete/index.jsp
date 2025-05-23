<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Delete Employee</title></head>
<body>
    <h2>Delete Employees with Name Starting With</h2>
    <form action="delete.jsp" method="post">
        Name Prefix: <input type="text" name="prefix" required><br><br>
        <input type="submit" value="Delete Records">
    </form>

    <br>
    <form action="report.jsp">
        <input type="submit" value="View Salary Report">
    </form>
</body>
</html>
