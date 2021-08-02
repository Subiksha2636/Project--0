package com.revature.pro.service;
import java.util.List;

import com.reature.pro.model.EmployeeCenter;
//import com.revature.pro.Exception.CustomException;

public interface EmployeeSerivce {
	void addEmployeeCenter(EmployeeCenter center);
		
	public void DeleteEmployeeCenter(EmployeeCenter center);
	public void DisplayEmployeeDetails(EmployeeCenter center);
	public void UpdateEmployeeData(EmployeeCenter center);
	public List<EmployeeCenter> getAllEmployee();
	public EmployeeCenter  getEmployeeOne(Integer eid);
}
