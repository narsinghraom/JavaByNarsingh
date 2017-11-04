<%@page import="colla.medical.logics.BussinessLogic"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/patient.js"></script>
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
							<li><a href="ViewPatient.jsp">View Patient</a></li>
							<li><a href="Logout.jsp">Logout</a></li>


						</ul>
					</div>
					<div class="image">
						<img src="images/patient.jpg" width="615" height="286" 
							alt="" style="position: relative; left: 250px" />
					</div>
					<center>
						<form  action="PatientServlet" method="post">
							
							<h2>
								<b>Add Patient Details Screen</b>
							</h2>


							<table align="center">
							<tr>
									<td>PatientId</td>
									<td><input type="hidden" id="patientId" name="patientId" value=<%=BussinessLogic.patientId() %>
										style="font-family: Comic Sans MS" size=20 onkeydown="clearAll()" /></td>
										
										
								</tr>
								<tr>
									<td>Patient Name</td>
									<td><input type="text" id="patientName" name="patientName"
										style="font-family: Comic Sans MS" size=20 onkeydown="clearAll()" /></td>
										<td><span id="span_patientName" style="color: red">please enter the patientname</span></td>
										
								</tr>

								<tr>
									<td>Age</td>
									<td><input type="text" id="patientage" name="patientage"
										style="font-family: Comic Sans MS" size=20 onkeydown="clearAll()" onkeypress="return isNumber(event)" /></td>
										<td><span id="span_patientage" style="color: red">please enter the patientage</span></td>
										
								</tr>
								

								<tr>
									<td>Gender</td>
									<td><select name="gender" style="font-family: Comic Sans MS">
											<option value="Male">Male</option>
											<option value="Female">Female</option>
									</select></td>
								</tr>

								<tr>
									<td>Problem</td>
									<td><textarea name="problem" rows="4" cols="47" id="problem" onkeydown="clearAll()"
										style="font-family: Comic Sans MS" ></textarea></td>
										<td><span id="span_problem" style="color: red">please enter the problem</span></td>
								</tr>


								<tr>
									<td>Contact&nbsp;No</td>
									<td><input type="text" name="contactNo" id="contact" onkeydown="clearAll()"
										style="font-family: Comic Sans MS" size=20 onkeypress="return isNumber(event)" maxlength="10" /></td>
										<td><span id="span_contact" style="color: red">please enter your contactno</span></td>
								</tr>

								<tr>
									<td>Address</td>
									<td><textarea name="address" id="address" style="font-family: Comic Sans MS" onkeydown="clearAll()"
											rows="2" cols="30"></textarea></td>
											<td><span id="span_address" style="color: red">please enter the address</span></td>
								</tr>

								<tr>
									<td></td>
									<td><input type="submit" value="Add Patient" onclick="return validation()"/></td></tr>
							</table>
							
				</form>
				</center>
				</div></div>
</body>
</html>