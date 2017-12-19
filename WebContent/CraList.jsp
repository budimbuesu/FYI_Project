<%@page import="model.Cra"%>
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
<jsp:useBean id="craDAO" scope = "session" class = "dao.CraHome"/>
<table border="1" cellpadding="10px" cellspacing ="0">
		<tr>
			<td>
				<b>CRA</b>
			</td>
			<td>
				<b>Mission ID</b>
			</td>
			<td>
				<b>Salarie ID</b>
			</td>
			<td>
				<b>Statut</b>
			</td>
			<td>
				<b>Date</b>
			</td>
		</tr>
		
	 <%
	 	List<Cra> craList = craDAO.getListCra();
	 	for (int i = 0; i < craList.size(); i++) {%>
	 		<tr>
	 		<td>
				<a href = "Cra.jsp"> <%=craList.get(i).getCraId()%> </a>
			</td>
			<td>
				<%=craList.get(i).getMission().getMissionId()%>
			</td>
			<td>
				<%=craList.get(i).getSalarie().getSalarieId()%>
			</td>
			<td>
				<%=craList.get(i).getStatut()%>
			</td>
			<td>
				<%=craList.get(i).getCraDate()%>
			</td>
		</tr>
	 <%}
	 %>
	 </table>
</body>
</html>