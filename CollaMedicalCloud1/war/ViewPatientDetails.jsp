<%@page import="java.util.List"%>
<%@page import="colla.medical.dao.DaoImp"%>
<%@page import="colla.medical.bean.PatientBean"%>
<%@page import="java.util.Iterator"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="styles/indexStyle.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/viewpatient.js"></script>
</head>
<body>
<div class="main">
		<div class="main_resize">
			<div class="header">
				<div class="logo">
					<h1 align="center">
						<span>Collaboration in Multicloud Computing Environments :
							Framework and Security Issues (Cloud 1)</span><small></small></h1>
				<div class="content">
				<div class="content_bg">
				<div class="menu_nav ">
						<ul>
							<li class="active"><a href="ViewPatientDetails.jsp">View Patient
									Details</a></li>
							<li><a href="Logout.jsp">Logout</a></li>
						</ul>
					</div>
					<div class="image">
						<img src="images/recording.jpg" width="615" height="286" 
							alt="" style="position: relative; left: 220px" />
					</div>
					<center>
						<form >
							
							<h2>
								<b>View Patient Details Screen</b>
							</h2>
							
							
							<%
	String res = request.getParameter("patientId");
	if(res != null){
		out.println("<center><font face=verdana color=red>"+res+"</center></font>");
	}%>
							
							
							<table align="center" >
								<tr>
									<td><b>Patient ID</b></td>
									<td><input type="text" name="t1" id="patientId"
										style="font-family: Comic Sans MS" size=20 onkeydown="clearAll()" /></td>
										<td><span id="span_patientId" style="color: red">please enter the username</span></td>
								</tr>

																<tr>
									<td></td>
									<td><input type="submit" value="View" onclick="return validation()"></td>
							</table>
							</form>
							</center>
				</div>

			</div>
</body>
</html>