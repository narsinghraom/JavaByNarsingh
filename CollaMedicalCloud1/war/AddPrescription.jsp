<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />

<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/Prescription.js"></script>
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
							<li><a href="ViewPatientDetails.jsp">View Patient
									Details</a></li>
							<li><a href="Logout.jsp">Logout</a></li>
						</ul>
					</div>
						
					<div class="image">
						<img src="images/prescription.jpg" width="615" height="286" 
							alt="" style="position: relative; left: 220px" />
					</div>
					<center>
						<form action="PrescriptionServlet" method="post">
						
							<h2>
								<b>View Patient Details Screen</b>
							</h2>

		
							<table align="center" >
								<tr>
									<td><b>Patient ID</b></td>
									<td><input type="text" name="patientId" id="patientId"
										style="font-family: Comic Sans MS" size=20 onkeydown="clearAll()" /></td>
										<td><span id="span_patientId" style="color: red">please enter the patientId</span></td>
								</tr>
								
								<tr>
									<td><b>Prescription</b></td>
									<td><textarea name="prescription" id="prescription" rows="6" cols="27" onkeydown="clearAll()"
										style="font-family: Comic Sans MS" ></textarea></td>
										<td><span id="span_prescription" style="color: red">please enter the Prescription</span></td>
								</tr>

																<tr>
									<td></td>
									<td><input type="submit" value="Add" onclick="return validation()"></td>
							</table>
							</form>
							</center>
				</div>

			</div>
</body>
</html>