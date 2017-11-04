package colla.medical.controller;

import java.io.IOException;

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
		
		 DaoImp dao=new DaoImp();
		boolean status= dao.addPatient(patientbean);
		
				RequestDispatcher rd=request.getRequestDispatcher("AddPatient.jsp");
				rd.forward(request, response);
			
				
			}

	}


