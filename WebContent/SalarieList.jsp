<%@page import="model.Salarie"%>
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

<jsp:useBean id="salarieDAO" scope = "session" class = "dao.SalarieHome"/>

<table border="1" cellpadding="10px" cellspacing ="0">
		<tr>
			<td>
				<b>Nom</b>
			</td>
			<td>
				<b>Prenom</b>
			</td>
			<td>
				<b>Poste</b>
			</td>
			<td>
				<b>Date d'entree</b>
			</td>
			<td>
				<b>Date de sortie</b>
			</td>
		</tr>
		
	 <%
	 	List<Salarie> salarieList = salarieDAO.getListSalarie();
	 	for (int i = 0; i < salarieList.size(); i++) {%>
	 		<tr>
	 		<td>
				<a href = "Cra.jsp"> <%=salarieList.get(i).getNom()%> </a>
			</td>
			<td>
				<%=salarieList.get(i).getPrenom()%>
			</td>
			<td>
				<%=salarieList.get(i).getPoste()%>
			</td>
			<td>
				<%=salarieList.get(i).getDateEntree()%>
			</td>
			<td>
				<%=salarieList.get(i).getDateSortie()%>
			</td>
		</tr>
	 <%}
	 %>
	 </table>

</body>
</html>