<%@ page session="true" %>
<%
    request.setCharacterEncoding("UTF-8");
    String username = request.getParameter("username");

    if (username != null) {
        session.setAttribute("username", username);
        session.setMaxInactiveInterval(60); // 60 seconds = 1 minute
    } else {
        username = (String) session.getAttribute("username");
    }

    if (username == null) {
        // Session expired or no user provided
        response.sendRedirect("sessionExpired.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Hello, <%= username %>!</h2>
    <p>Session will expire in 1 minute. Wait and refresh this page to test expiration.</p>
</body>
</html>
