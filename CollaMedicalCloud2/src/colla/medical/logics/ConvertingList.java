package colla.medical.logics;

import java.util.Iterator;
import java.util.List;

import colla.medical.bean.EmpBean;
import colla.medical.bean.LoginBean;

public class ConvertingList {
	
	/*
	 * converting a single employeeobject with database list object and client side value object.
	*/
	public static EmpBean loginListConvert(LoginBean loginBean, List<EmpBean> listEmp){
		EmpBean empBean=null;
		if(listEmp!=null && listEmp.size()>0){
		Iterator<EmpBean> iterator=listEmp.iterator();
		while(iterator.hasNext())
		{
			EmpBean empBeanTemp=(EmpBean)iterator.next();
			if(loginBean !=null && empBeanTemp !=null)
			{
					if((empBeanTemp.getUsername().equals(loginBean.getUserName()))&&(empBeanTemp.getPassword().equals(loginBean.getPassword()))){
						empBean=empBeanTemp;
					}
			}
			
			
		}
		
		}
		return empBean;
	}

}
