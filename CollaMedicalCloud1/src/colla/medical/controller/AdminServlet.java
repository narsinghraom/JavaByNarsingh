package colla.medical.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
/*import javax.servlet.annotation.WebServlet;*/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

import colla.medical.bean.AdminBean;
import colla.medical.dao.Dao;
/*import colla.medical.dao.DaoImp;*/
/*import colla.medical.dao.DaoImplementation;*/
import colla.medical.dao.DaoImp;

/**
 * Servlet implementation class AdminServlet
 */
/* @WebServlet("/AdminServlet") */
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminServlet() {
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
		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		PrintWriter out=response.getWriter();
		RequestDispatcher forwardAction = request.getRequestDispatcher("AdminScreen.jsp");
		RequestDispatcher includeAction = request.getRequestDispatcher("Admin.jsp");
		if(userName.equals("admin"))
		{
			if(password.equals("password")){
				forwardAction.forward(request, response);
				
			}
			else
			{
				out.print("Incorrect Password, Please enter a correct password");
				includeAction.include(request, response);
			}
			
		}
		else
		{
			out.print("UserId Invalid ! Please try Again");
			includeAction.include(request, response);
		}
		
		
	}

}
