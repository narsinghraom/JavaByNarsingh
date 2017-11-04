package colla.medical.dao;

import java.util.List;

import colla.medical.bean.AdminBean;
import colla.medical.bean.EmpBean;
import colla.medical.bean.LoginBean;
import colla.medical.bean.PatientBean;
import colla.medical.bean.PrescriptionBean;







import colla.medical.logics.ConvertingList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;



public class DaoImp 
 {
	

	  public List<EmpBean> readEmp(){
		  EntityManager em = EMFService.get().createEntityManager();
		    // Read the existing entries
		    Query q = em.createQuery("select m from EmpBean m");
		    @SuppressWarnings("unchecked")
			List<EmpBean> todos = q.getResultList();
		    return todos;
	  }
	  
	  public EmpBean login(LoginBean loginBean){
		  EmpBean empBeam=null;
		  EntityManager entity=EMFService.get().createEntityManager();
		  Query query=entity.createQuery("select e from EmpBean e");
		  @SuppressWarnings("unchecked")
		List<EmpBean> listEmp = query.getResultList();
		  empBeam=ConvertingList.loginListConvert(loginBean, listEmp);
		  return empBeam;
		  
	  }
	
	  
	 public boolean admin(AdminBean adminbean) {
		  boolean flag = false;
		  synchronized (this) {
	      EntityManager em = EMFService.get().createEntityManager();
	     
	      em.persist(adminbean);
	      em.close();
	      flag = true;
	    }
		  return flag;
	  }
	  
public boolean addEmp(EmpBean empbean) {
		  boolean flag = false;
		  synchronized (this) {
	      EntityManager em = EMFService.get().createEntityManager();
	     
	      em.persist(empbean);
	      em.close();
	      flag = true;
	    }
		  return flag;
	  }
	  
	  public List<PatientBean> readPatient(){
		  EntityManager em = EMFService.get().createEntityManager();
		    // Read the existing entries
		    Query q = em.createQuery("select m from PatientBean m");
		    @SuppressWarnings("unchecked")
			List<PatientBean> todos = q.getResultList();
		    return todos;
	  }
	  
	  public int getPatientID(){
		  EntityManager em = EMFService.get().createEntityManager();
		    // Read the existing entries
		    Query q = em.createQuery("select m from PatientBean m");
		    @SuppressWarnings("unchecked")
			List<PatientBean> todos = q.getResultList();
		    return todos.size()+1;
	  }
/*
	  public int addPatient(PatientBean patientbean) {
		  int id = 0;
		  synchronized (this) {
	      EntityManager em = EMFService.get().createEntityManager();
	    
	      em.persist(patientbean);
	      em.close();
	      
	    }
		  return id;
	  }*/
	  

	  public Boolean addPatient(PatientBean patientbean) {
		
		  boolean flag = false;
		  synchronized (this) {
	      EntityManager em = EMFService.get().createEntityManager();
	     
	      em.persist(patientbean);
	      em.close();
	      flag = true;
	    }
		  return flag;
	  }
	  
	  public List<PrescriptionBean> readPrescription(){
		  EntityManager em = EMFService.get().createEntityManager();
		    // Read the existing entries
		    Query q = em.createQuery("select m from PrescriptionBean m");
		    @SuppressWarnings("unchecked")
			List<PrescriptionBean> todos = q.getResultList();
		    return todos;
	  }
	  
	  

	  public boolean addPrescription(PrescriptionBean prescriptionbean) {
		  boolean flag = false;
		  synchronized (this) {
	      EntityManager em = EMFService.get().createEntityManager();
	      
	      em.persist(prescriptionbean);
	      em.close();
	      flag = true;
	    }
		  return flag;
	  }


}

