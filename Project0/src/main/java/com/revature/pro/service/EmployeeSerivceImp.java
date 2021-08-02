package com.revature.pro.service;

import java.util.List;
import java.util.logging.Logger;

import com.reature.pro.model.EmployeeCenter;
import com.revature.pro.Exception.CustomException;
import com.revature.pro.dao.EmployeeDAO;
import com.revature.pro.dao.EmployeeDAOImp;

public class EmployeeSerivceImp implements EmployeeSerivce {
	static Logger logger = Logger.getLogger("EmployeeSeriveImp.class");

	EmployeeDAO dao = new EmployeeDAOImp();
	public void addEmployeeCenter(EmployeeCenter center)throws  CustomException
	{
		logger.info("=================Service 1======================");
		try{
			dao.addEmloyeeCenter(center);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void DeleteEmployeeCenter(EmployeeCenter center)throws CustomException
	{
		
		logger.info("=================Service 2======================");
		try{
			dao.DeleteEmployeeCenter(center);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public void DisplayEmployeeDetails(EmployeeCenter center)throws CustomException{
		logger.info("=================Service 3======================");
		try{
			dao.DisplayEmployeeDetails(center);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void UpdateEmployeeData(EmployeeCenter center)throws CustomException
	{
		logger.info("=================Service 4======================");
		
		try{
			dao.UpdateEmployeeData(center);
		}
		catch(Exception e){
			throw new CustomException("Invalid serive update  data");
		}
	}
	public List<EmployeeCenter> getAllEmployee()
	{
		logger.info("=================Service 5======================");
		
		
			return dao.getAllEmployee();
		
	}
	public EmployeeCenter  getEmployeeOne(Integer eid){
		logger.info("=================Service 6======================");
		
		
		return dao.getEmployeeOne(eid);
	}
	
}
