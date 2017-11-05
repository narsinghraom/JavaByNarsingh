<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="styles/indexStyle.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<script type="text/javascript" src="js/Login.js"></script>

<title>Insert title here</title>
</head>
<body>
	<div class="main">
		<div class="main_resize">
			<div class="header">
				<div class="logo">
					<h1 align="center">
						<span>Collaboration in Multicloud Computing Environments :
							Framework and Security Issues (Cloud 1)</span><small></small>
					</h1>
					<div class="content">
						<div class="content_bg">
							<div class="menu_nav ">
								<ul>
									<li><a href="index.jsp">Home</a></li>
									<li><a href="Admin.jsp">Administrator</a></li>
									<li class="active"><a href="Login.jsp">Receptionist</a></li>
									<li><a href="Login.jsp">Doctor</a></li>

								</ul>
							</div>

							<div class="image">
								<img src="images/vr3.png" width="615" height="286" alt=""
									style="position: relative; left: 290px" />
							</div>
							<center>
								<form action="LoginServlet" method="post">

									<h2>
										<b>Login Screen</b>
									</h2>

									<table align="center">
										<tr>
											<td><b>Username</b></td>
											<td><input type="text" name="userName" id="username"
												style="font-family: Comic Sans MS" size=20
												onkeydown="clearAll()" /></td>
											<td><span id="span_usename" style="color: red">please
													enter the username</span></td>

										</tr>

										<tr>
											<td><b>Password</b></td>
											<td><input type="password" name="password" id="password"
												style="font-family: Comic Sans MS" size=20
												onkeydown="clearAll()" /></td>
											<td><span id="span_password" style="color: red">please
													enter the password</span></td>

										</tr>

										<tr>
											<td><b>Usertype</b></td>
											<td><select name="userType" id="usertype">
													<option value="Doctor">Doctor</option>
													<option value="Receptionist">Receptionist</option>
											</select></td>
											<td><span id="span_usertype" style="color: red">please
													select any usertype</span></td>
										</tr>
										<tr>
											<td></td>
											<td><input type="submit" value="Login"
												onclick="return validation()"></td>
									</table>
								</form>
							</center>
						</div>

					</div>
</body>
</html>