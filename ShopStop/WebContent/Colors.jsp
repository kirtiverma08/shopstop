<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>COLORS</title>
</head>

<%!
String[] name={"RED","BLACK","PINK","yellow"};
%>
<body>
<H1>LIST OF COLORS</H1>
<table border=0>


<%
for(int i=0 ;i<name.length;i++)
{
%>

<tr>
<td bgcolor="<%=name[i] %>" width="200" ><%=name[i] %> </td>
</tr>

<%
}
%>
</table>

</body>

</html>