package com.revature.pro.Project0;
import com.reature.pro.model.EmployeeCenter;
import java.util.logging.Logger;
import com.revature.pro.Exception.CustomException;



public class EmployeeManagement {
	static Logger logger = Logger.getLogger("EmployeeManagement.class");

	public static void main(String[] args)throws  CustomException {
		
		logger.info("=================Main ======================");
		EmployeeCenter center = new EmployeeCenter();

		
		 //values should be passed 
		EmployeeAdmin as = new EmployeeAdmin();
		as.Admin(center);
		 
		 
		
	 
		 
	}

}
