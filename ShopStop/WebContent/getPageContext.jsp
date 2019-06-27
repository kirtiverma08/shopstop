<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>get page</title>
</head>
<body>
<%
String Name=(String)pageContext.getAttribute("HELLO",PageContext.SESSION_SCOPE);
String fullName=(String)pageContext.getAttribute("fullName",PageContext.SESSION_SCOPE);
out.println("hi "+ Name +" ");
out.println("this is ur fullname:"+fullName);
%>
</body>
</html>