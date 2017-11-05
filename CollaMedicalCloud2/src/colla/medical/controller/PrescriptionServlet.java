package colla.medical.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
/*import javax.servlet.annotation.WebServlet;*/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import colla.medical.bean.PrescriptionBean;

/**
 * Servlet implementation class PrescriptionServlet
 */
/*@WebServlet("/PrescriptionServlet")*/
public class PrescriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrescriptionServlet() {
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
		String patientId=request.getParameter("patientId");
		String prescription=request.getParameter("prescription");
		PrescriptionBean prescriptionbean=new PrescriptionBean();
		prescriptionbean.setPatientId(patientId);
		prescriptionbean.setPrescription(prescription);
		/*if(flag){
			RequestDispatcher rd=request.getRequestDispatcher("DoctorScreen.jsp?t1=Prescription details added");
			rd.forward(request, response);
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("DoctorScreen.jsp?t1=Error in adding prescription details");
			rd.forward(request, response);
		}*/
		
		
	}

}
