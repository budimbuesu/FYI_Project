<%@page import="model.Client"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="clientDAO" scope = "session" class = "dao.ClientHome"/>
<table border="1" cellpadding="10px" cellspacing ="0">
		<tr>
			<td>
				<b>Cient</b>
			</td>
			<td>
				<b>Nom</b>
			</td>
			<td>
				<b>Prenom</b>
			</td>
		</tr>
		
	 <%
	 	List<Client> clientList = clientDAO.getClientList();
	 	for (int i = 0; i < clientList.size(); i++) {%>
	 		<tr>
	 		<td>
				<a href = "Client.jsp"> <%=clientList.get(i).getClientId()%> </a>
			</td>
			<td>
				<%=clientList.get(i).getNom()%>
			</td>
			<td>
				<%=clientList.get(i).getPrenom()%>
			</td>
		</tr>
	 <%}
	 %>
	 </table>
</body>
</html>