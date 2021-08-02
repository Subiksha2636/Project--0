package com.revature.pro.Controller;
import com.revature.pro.service.EmployeeSerivceImp;
import com.revature.pro.Exception.CustomException;
import com.revature.pro.service.EmployeeSerivce;

import java.util.List;
import java.util.logging.Logger;

import com.reature.pro.model.EmployeeCenter;

public class EmployeeController {
	static Logger logger = Logger.getLogger("EmployeeController.class");
	EmployeeSerivce service = new EmployeeSerivceImp();
	public void addEmployeeCenter(EmployeeCenter center)throws  CustomException
	{
		logger.info("=================Controller 1======================");
		try{
			service.addEmployeeCenter(center);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
	public void DeleteEmployeeCenter(EmployeeCenter center)throws CustomException
	{
		logger.info("=================Controller 2======================");
		try{
			service.DeleteEmployeeCenter(center);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public void DisplayEmployeeDetails(EmployeeCenter center)throws CustomException{
		logger.info("=================Controller 3======================");
		try{
			service.DisplayEmployeeDetails(center);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void UpdateEmployeeData(EmployeeCenter center)throws CustomException
	{
		logger.info("=================Controller 4======================");
		try{
			service.UpdateEmployeeData(center);
		}
		catch(Exception e){
			throw new CustomException("Invalid con update data");
		}
	}
	public List<EmployeeCenter> getAllEmployee()
	{
		logger.info("=================Controller 5======================");
		
			return service.getAllEmployee();
		
	}
	public EmployeeCenter  getEmployeeOne(Integer eid){
		logger.info("=================Controller 6======================");
		
		return service.getEmployeeOne(eid);
	}
	
}
