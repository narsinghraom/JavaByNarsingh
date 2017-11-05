package colla.medical.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
/*import javax.servlet.annotation.WebServlet;*/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import colla.medical.bean.EmpBean;
import colla.medical.dao.Dao;
import colla.medical.dao.DaoImp;
/*import colla.medical.dao.DaoImp;*/
/*import colla.medical.dao.DaoImplementation;*/

/**
 * Servlet implementation class EmpServlet
 */
/*@WebServlet("/EmpServlet")*/
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username=request.getParameter("username");
		 String password=request.getParameter("password");
	     String usertype=request.getParameter("usertype");
		 String qualification=request.getParameter("qualification");
		 String contactno=request.getParameter("contactno");
		 Long contact=Long.parseLong(contactno);
		 String address=request.getParameter("address");
		 EmpBean empbean=new EmpBean();
		 empbean.setUsername(username);
		 empbean.setPassword(password);
		 empbean.setUsertype(usertype);
		 empbean.setQualification(qualification);
		 empbean.setContactno(contact);
		 empbean.setAddress(address);
		 RequestDispatcher forwardAction = request.getRequestDispatcher("AdminScreen.jsp");
		 RequestDispatcher includeAction = request.getRequestDispatcher("AddEmp.jsp");
		 PrintWriter out=response.getWriter();
		 DaoImp daoimp=new DaoImp();
		 boolean stauts=daoimp.addEmp(empbean);
		 if(stauts)
		 {
			 forwardAction.forward(request, response);
		 }
		 else
		 {
			 out.print("Something went worng ! Please Try Again");
			 includeAction.include(request, response);
			 
		 }
		 
		 
		 
	}

}
