package com.revature.pro.Project0;

import com.reature.pro.model.EmployeeCenter;
import com.revature.pro.Controller.EmployeeController;
import com.revature.pro.Exception.CustomException;
import java.util.*;
import java.util.logging.Logger;


public class EmployeeAdmin {
	static Logger logger = Logger.getLogger("EmployeeAdmin.class");
	public static void Admin(EmployeeCenter center)throws CustomException
	{
		logger.info("=================Admin======================");
		
		 System.out.println("==== Employee Details====");
		 System.out.println("===1.insert data===");
		 System.out.println("===2.delete data===");
		 System.out.println("===3.Display data===");
		 System.out.println("===4.update data===");
		 System.out.println("===5.All collection data===");
		 System.out.println("===6.One row dispaly===");
		 System.out.println("===7.exit===");
		 EmployeeController controller = new EmployeeController();
		 EmployeeValues value1 = new EmployeeValues();
	
		Scanner s = new Scanner(System.in);
		int ch = s.nextInt();
		switch(ch){
		case 1: 
			value1.InsertValues(center);
			controller.addEmployeeCenter(center);
			Admin(center);
			break;
		case 2:
			controller.DeleteEmployeeCenter(center);
			Admin(center);
			break;
		case 3:
			controller.DisplayEmployeeDetails(center);
			Admin(center);
			break;
		case 4:
			controller.UpdateEmployeeData(center);
			Admin(center);
			break;
		case 5:
			System.out.println(controller.getAllEmployee());
			Admin(center);
			break;
		case 6:
			System.out.println("enter the Id");
			int eid = s.nextInt();
			System.out.println(controller.getEmployeeOne(eid));
			Admin(center);
			break;
		
		default :
			throw new CustomException("Invaild data main ");
		}
			
	}
}
