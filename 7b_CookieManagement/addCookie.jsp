<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String message = "";
    if ("POST".equalsIgnoreCase(request.getMethod())) {
        String name = request.getParameter("cookieName");
        String domain = request.getParameter("domain");
        int maxAge = Integer.parseInt(request.getParameter("maxAge"));

        Cookie cookie = new Cookie(name, "SetByUser");
        cookie.setMaxAge(maxAge);

        if (!domain.isEmpty()) {
            // Note: domain should be valid and allowed for your server
            // cookie.setDomain(domain); // Uncomment carefully in real deployments
        }

        response.addCookie(cookie);
        message = "Cookie '" + name + "' set with expiry " + maxAge + " seconds.";
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Cookie Manager</title>
</head>
<body>
    <h2>Set a Cookie</h2>
    <form method="post" action="addCookie.jsp">
        Name: <input type="text" name="cookieName" required><br><br>
        Domain: <input type="text" name="domain"><br><br>
        Max Age (in seconds): <input type="number" name="maxAge" required><br><br>
        <input type="submit" value="Add Cookie">
    </form>

    <p style="color:green;"><%= message %></p>

    <p><a href="showCookies.jsp">Go to Active Cookie List</a></p>
</body>
</html>
