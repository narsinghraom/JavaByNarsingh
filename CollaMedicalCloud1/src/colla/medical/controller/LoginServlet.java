package colla.medical.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
/*import javax.servlet.annotation.WebServlet;*/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import colla.medical.bean.EmpBean;
import colla.medical.bean.LoginBean;

import colla.medical.dao.DaoImp;

/**
 * Servlet implementation class LoginServlet
 */
/* @WebServlet("/LoginServlet") */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		response.getWriter().println("hello");

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String userType = request.getParameter("userType");
		LoginBean loginBean=new LoginBean();
		loginBean.setUserName(userName);
		loginBean.setPassword(password);
		loginBean.setUserType(userType);
		DaoImp dao = new DaoImp();
		EmpBean empBean = null;
		PrintWriter out = response.getWriter();
		RequestDispatcher doctorForward = request
				.getRequestDispatcher("DoctorScreen.jsp");
		RequestDispatcher receptionForward = request
				.getRequestDispatcher("ReceptionistScreen.jsp");
		RequestDispatcher loginInclude = request
				.getRequestDispatcher("Login.jsp");
		empBean = dao.login(loginBean);
		if (empBean != null) {
			if (empBean.getUsername().equals(userName)) {
				if (empBean.getPassword().equals(password)) {
					if (userType.equals("Doctor")) {
						doctorForward.forward(request, response);
					} else if (userType.equals("Receptionist")) {
						receptionForward.forward(request, response);
					} else {
						out.print("No Employee Found");
						loginInclude.include(request, response);
					}

				} else {
					out.print("Invalid Password");
					loginInclude.include(request, response);
				}

			} else {
				out.print("Invalid UserId..");
				loginInclude.include(request, response);
			}

		} else {
			out.print("Invalid Credentials..");
			loginInclude.include(request, response);
		}
	}
}
