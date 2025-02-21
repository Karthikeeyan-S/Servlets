<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RequestDemo</title>
</head>
<body>
<% 
String name = request.getParameter("uname");
out.println("welcome "+name);
//session.setAttribute("user",name);


%>
<a href="second.jsp"> second_jsp_page </a>

</body>
</html>