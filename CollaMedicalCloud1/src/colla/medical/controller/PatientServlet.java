package colla.medical.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
/*import javax.servlet.annotation.WebServlet;*/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import colla.medical.bean.PatientBean;
import colla.medical.dao.Dao;
import colla.medical.dao.DaoImp;
/*import colla.medical.dao.DaoImp;*/
/*import colla.medical.dao.DaoImplementation;*/

/**
 * Servlet implementation class PatientServlet
 */
/*@WebServlet("/PatientServlet")*/
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientServlet() {
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
		
		response.setContentType("text/html");
		String patientName=request.getParameter("patientName");
	 String age=request.getParameter("patientage");
		 String gender=request.getParameter("gender");
		 String problem=request.getParameter("problem");
		 
		 String contactNo= request.getParameter("contactNo");
		 long contact=Long.parseLong(contactNo);
		 String address=request.getParameter("address");
		 PatientBean patientbean=new PatientBean();
		 patientbean.setPatientName(patientName);
		 patientbean.setAge(age);
		 patientbean.setGender(gender);
		 patientbean.setProblem(problem);
		 patientbean.setContactNo(contact);
		 patientbean.setAddress(address);
		 RequestDispatcher forwardAction = request.getRequestDispatcher("ReceptionistScreen.jsp.jsp");
		 RequestDispatcher includeAction = request.getRequestDispatcher("AddPatient.jsp");
		 PrintWriter out=response.getWriter();
		 DaoImp daoimp=new DaoImp();
		 boolean stauts=daoimp.addPatient(patientbean);
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


