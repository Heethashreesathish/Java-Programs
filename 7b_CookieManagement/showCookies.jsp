<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Active Cookies</title>
</head>
<body>
    <h2>Active Cookie List</h2>
    <%
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie c : cookies) {
    %>
        <p>
            Name: <%= c.getName() %><br>
            Value: <%= c.getValue() %><br>
            Max Age: <%= c.getMaxAge() %> seconds<br>
            <hr>
        </p>
    <%
            }
        } else {
    %>
        <p>No cookies found.</p>
    <%
        }
    %>

    <p><a href="addCookie.jsp">Back to Cookie Form</a></p>
</body>
</html>
