<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="getPageContext.jsp">
<%
String Name=request.getParameter("Name");
String fullName=request.getParameter("fullName");
out.println("Hello "+ Name + " "+fullName);

pageContext.setAttribute("HELLO",Name,PageContext.SESSION_SCOPE);
pageContext.setAttribute("fullName",fullName,PageContext.SESSION_SCOPE);
%>
<input type="submit" value="GOGO"/>
</form>
</body>
</html>