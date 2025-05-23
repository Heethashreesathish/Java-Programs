<%@ include file="dbconfig.jsp" %>
<%@ page import="java.sql.*" %>
<%
    String idParam = request.getParameter("id");
    if (idParam != null) {
        try {
            int id = Integer.parseInt(idParam);
            String delQuery = "DELETE FROM coffee WHERE id=?";
            PreparedStatement delStmt = conn.prepareStatement(delQuery);
            delStmt.setInt(1, id);
            delStmt.executeUpdate();
            delStmt.close();
        } catch (Exception e) {
            out.println("Error deleting record: " + e.getMessage());
        }
    }
    if (conn != null) conn.close();
    response.sendRedirect("index.jsp");
%>
