<%@page import="java.util.List"%>
<%@page import="colla.medical.dao.DaoImp"%>
<%@page import="colla.medical.bean.PatientBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="styles/indexStyle.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="main">
		<div class="main_resize">
			<div class="header">
				<div class="logo">
					<h1>
						<span>Collaboration in Multicloud Computing Environments :
							Framework and Security Issues (Cloud 1)</span><small></small>
					</h1>
				
			<div class="content">
				<div class="content_bg">
					<div class="menu_nav">
						<ul>
							<li><a href="AddPatient.jsp">Add Patient Details</a></li>
							<li class="active"><a href="ViewPatient.jsp">View Patient</a></li>
							<li><a href="Logout.jsp">Logout</a></li>

						</ul>
					</div>
					<div class="image">
						<img src="images/patient.jpg" width="615" height="286" 
							alt="" style="position: relative; left: 280px" />
					</div>
					<center>
					<h2><b>View Patient Details</b></h2>
					<table border="1" align="center" width="100%">
					<tr><th>Patient ID</th><th>Patient Name</th><th>Age</th><th>Gender</th><th>Problem</th><th>Contact</th><th>Address</th></tr>
					
					<%
					DaoImp dao=new DaoImp();
					List<PatientBean> list = dao.readPatient();
					out.println("list "+list);
					if(list.size() > 0){
						for(int i=0;i<list.size();i++){
							PatientBean bean = list.get(i);%>
							<td><font size="3" color="black"><%=bean.getPatientId()%></font></td>
							<td><font size="3" color="black"><%=bean.getPatientName()%></font></td>
							<td><font size="3" color="black"><%=bean.getAge()%></font></td>
							<td><font size="3" color="black"><%=bean.getGender()%></font></td>
							<td><font size="3" color="black"><%=bean.getProblem()%></font></td>
							<td><font size="3" color="black"><%=bean.getContactNo()%></font></td>
							<td><font size="3" color="black"><%=bean.getAddress()%></font></td>
						</tr>
						<%}
					}
					%>
					
					</table>
					</center>
</body>
</html>