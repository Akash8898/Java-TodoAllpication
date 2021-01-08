<%@page import="com.testing.web.model.Data" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor='cyan'>

	<%
		
		Data d1 = (Data)request.getAttribute("data");
		out.println(d1);
		
	%>

</body>
</html>