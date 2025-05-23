//8c. Develop a JDBC project using JSP to append the fields empno, empname and basicsalary
//into the table Emp of the database Employee by getting the fields through keyboard and
//Generate the report as follows for the TABLE Emp (Emp_NO , Emp_Name, Basicsalary ) using
//HTML and JSP to get the fields and display the results respectively



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/employee";
    String username = "root";
    String password = "";  // replace with your MySQL root password
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(url, username, password);
%>

</body>
</html>
