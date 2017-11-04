<%@page import="java.util.List"%>
<%@page import="colla.medical.dao.DaoImp"%>
<%@page import="colla.medical.bean.EmpBean"%>
<%@page import="java.util.Iterator"%>

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
					<h1 align="center">
						<h1>
							<span>Collaboration in Multicloud Computing Environments :
								Framework and Security Issues (Cloud 1)</span><small></small>
						</h1>

						<div class="content">
							<div class="content_bg">
								<div class="menu_nav">
									<ul>
										<li><a href="AddEmp.jsp">Add Employees</a></li>
										<li class="active"><a href="ViewEmp.jsp">View
												Employees</a></li>
										<li><a href="ProxyAccess.jsp">Cloud2 Proxy Access</a></li>

										<li><a href="Logout.jsp">Logout</a></li>

									</ul>
								</div>

								<div class="image">
									<img src="images/cloud2.png" width="615" height="286" alt=""
										style="position: relative; left: 220px" />
								</div>
								<center>
									<h2>
										<b>View Employee Details</b>
									</h2>
									<table border="1" align="center" width="100%">
										<tr>
											<th>Username</th>
											<th>Password</th>
											<th>Usertype</th>
											<th>Qualification</th>
											<th>Contact No</th>
											<th>Address</th>
										</tr>

										<%
											DaoImp dao=new DaoImp();
																		List<EmpBean> list=dao.readEmp();
																		Iterator<EmpBean> itr=list.iterator();

																		while(itr.hasNext())
																		{
																			EmpBean empbean=(EmpBean)itr.next();
																			if(empbean!=null){
										%>
										<tr>
											<td><font size="3" color="black"><%=empbean.getUsername()%></font></td>
											<td><font size="3" color="black"><%=empbean.getPassword()%></font></td>
											<td><font size="3" color="black"><%=empbean.getUsertype()%></font></td>
											<td><font size="3" color="black"><%=empbean.getQualification()%></font></td>
											<td><font size="3" color="black"><%=empbean.getContactno()%></font></td>
											<td><font size="3" color="black"><%=empbean.getAddress()%></font></td>
										</tr>
										<%
											}
																		}
										%>

									</table>
								</center>
</body>
</html>