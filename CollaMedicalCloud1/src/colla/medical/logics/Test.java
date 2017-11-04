package colla.medical.logics;

import java.util.List;

import colla.medical.bean.EmpBean;
import colla.medical.dao.DaoImp;

public class Test {

	public static void main(String[] args) {
		
		DaoImp dao=new DaoImp();
		List<EmpBean> listofEmp=dao.readEmp();
		for(EmpBean emp:listofEmp)
		{
			System.out.println(emp.getId() + " "+emp.getUsername());
		}
	}

}
