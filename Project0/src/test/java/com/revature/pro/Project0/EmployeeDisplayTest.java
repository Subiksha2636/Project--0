package com.revature.pro.Project0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.reature.pro.model.EmployeeCenter;
import com.revature.pro.Exception.CustomException;
import com.revature.pro.dao.EmployeeDAOImp;
import com.revature.pro.dbutil.DBUtil;

import junit.framework.TestCase;

public class EmployeeDisplayTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testDisplayEmployeeDetails() {
		boolean flag=false;
		
		try{
			Connection con = DBUtil.getConnection();
			boolean Statement = true;
			flag=Statement;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee2");
			while(rs.next()){
				flag=true;
			}
			
		}
		catch(Exception e){
			throw new CustomException("Invalid test case");
		}
		assertTrue(flag);
	}
	public void testGetAllEmployee() {
		List<EmployeeCenter> blist  = new ArrayList<EmployeeCenter>();
		EmployeeDAOImp dao = new EmployeeDAOImp();
		blist=dao.getAllEmployee();
		assertNotNull(blist);
	}
	
	
	

}
