<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buffer</title>
</head>
<body>
<h1>Buffer size of implicit objects</h1>
<%
int size=out.getBufferSize();
int avail_size=out.getRemaining();
int used_size=size-avail_size;
%>
<b>Buffering status:</b>
<br>
<b>Total size:</b><%= size %>
<br>
<b>avail_size:</b><%=avail_size %><br>
<b>used_size:</b><%=used_size %><br>
</body>
</html>