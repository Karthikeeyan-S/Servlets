<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Cube Computation</title>
</head>
<body>
<%! 
int cube(int n)
{
	return n*n*n;
}
%>
<%= "Cube of 3 is:"+cube(3) %>
</body>
</html>