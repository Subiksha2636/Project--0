package com.revature.pro.dao;

import com.reature.pro.model.EmployeeCenter;
import java.util.List;

public interface EmployeeDAO  {
	public void addEmloyeeCenter(EmployeeCenter center);
	public void DeleteEmployeeCenter(EmployeeCenter center);
	public void DisplayEmployeeDetails(EmployeeCenter center);
	public void UpdateEmployeeData(EmployeeCenter center);
	public List<EmployeeCenter> getAllEmployee();
	public EmployeeCenter  getEmployeeOne(Integer eid);
}
