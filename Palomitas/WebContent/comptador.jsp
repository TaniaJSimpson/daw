<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Comptador</title>
</head>
<body>

<%= new java.util.Date() %>
<%= request.getParameter("nom") %>
<% 
String numero= request.getParameter("numero");
if(numero!=null){
	int n = Integer.valueOf(numero);
		for (int i=1; i <= n; i++){
			out.println(i);
		}
			
}%>

</body>
</html>