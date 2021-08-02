package com.revature.pro.dao;
import com.reature.pro.model.EmployeeCenter;
import java.util.Scanner;
import java.util.*;
import com.revature.pro.dbutil.DBUtil;
import com.revature.pro.Exception.CustomException;

import java.sql.*;
public class EmployeeDAOImp implements EmployeeDAO 
{
	//insert the data
	public void addEmloyeeCenter(EmployeeCenter center) throws  CustomException
	{
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//connection
			Connection con = DBUtil.getConnection();
			
			//statement
			//Statement st = con.createStatement();
			
			//create
			//st.executeUpdate("create table Employee2(eid int primary key,ename varchar(20),eaddress varchar(40),salary double, ddtid varchar(20),gender varchar(10))");
			
			
			//insert
			PreparedStatement pst=con.prepareStatement("insert into Employee2 values(?,?,?,?,?,?)");
			
			pst.setInt(1, center.getEid());
			pst.setString(2, center.getEname());
			pst.setString(3, center.getEaddress());
			pst.setDouble(4, center.getSalary());
			pst.setString(5, center.getDdtid());
			pst.setString(6, center.getGender());
			pst.execute();
	
			System.out.println("data inserted..");
		}
		catch (Exception e){
		
			throw new CustomException("Invalid insert data");
		}
		
		
		
	}
	
	//delete the data
	public void DeleteEmployeeCenter(EmployeeCenter center)throws CustomException
	{
		try{
			
			Connection con = DBUtil.getConnection();
//			Statement st = con.createStatement();
//			st.executeUpdate("delete from employee2 where ename='subi'");
		
			PreparedStatement pst=con.prepareStatement("delete from employee2 where eid=?");
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the delete id number = ");
			int n=s.nextInt();
			center.setEid(n);
			pst.setInt(1,center.getEid());
			pst.execute();
			
			System.out.println("Delete the data");

		}
		catch(Exception e){
			throw new CustomException("Invalid delete data");
		}
		
		
	}
	//display the data
	public void DisplayEmployeeDetails(EmployeeCenter center)throws CustomException{
		try{
			Connection con = DBUtil.getConnection();
			Statement st=con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee2");		
			
			while(rs.next()){
				System.out.println(rs.getInt(1)+ "   "+ rs.getString(2)+"  "+rs.getString(3)+ "  "+ rs.getDouble(4)+ "  "+ rs.getString(5)+"  "+rs.getString(6));
			}
			
		}
		catch(Exception e){
			throw new CustomException("Invalid display data");
		}
	}
	
	
	//update the data
	public void UpdateEmployeeData(EmployeeCenter center)throws CustomException{
	
		
		try{
			
			Connection con = DBUtil.getConnection();
						
			PreparedStatement pst=con.prepareStatement("update employee2 set ename=? where eid=?");
			Scanner s= new Scanner(System.in);
			System.out.print("Enter Update the Name = ");
			String name = s.next();
			System.out.println("Enter the Id = ");
			int id = s.nextInt();
			center.setEname(name);
			
			pst.setString(1,center.getEname());
			pst.setInt(2, id);
			pst.execute();

			System.out.println("update the date");
	
			
		}
		
		catch(Exception e){
			throw new CustomException("Invalid Update  data");
		}
		
	}
	
	//collection of the data 
	public List<EmployeeCenter> getAllEmployee(){
		List<EmployeeCenter> blist = new ArrayList<EmployeeCenter>();
		try{
			Connection con = DBUtil.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from employee2");
			while(rs.next()){
				EmployeeCenter Emp = new EmployeeCenter();
				Emp.setEid(rs.getInt(1));
				Emp.setEname(rs.getString(2));
				Emp.setEaddress(rs.getString(3));
				Emp.setSalary(rs.getDouble(4));
				Emp.setDdtid(rs.getString(5));
				Emp.setGender(rs.getString(6));
				blist.add(Emp);
			}
			
			
		}
		catch(Exception e){
			throw new CustomException("Invalid the list");
		}
		return blist;
		
		
	}
	//select the one row
	public EmployeeCenter  getEmployeeOne(Integer eid){
		EmployeeCenter Emp = new EmployeeCenter();
		try{
			Connection con = DBUtil.getConnection();
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery("select * from employee2");
			PreparedStatement pre = con.prepareStatement("select * from employee2 where eid=?");
			pre.setInt(1,eid);
			ResultSet rs = pre.executeQuery();
			while(rs.next()){
				//EmployeeCenter Emp = new EmployeeCenter();
				Emp.setEid(rs.getInt(1));
				Emp.setEname(rs.getString(2));
				Emp.setEaddress(rs.getString(3));
				Emp.setSalary(rs.getDouble(4));
				Emp.setDdtid(rs.getString(5));
				Emp.setGender(rs.getString(6));
				
			}
			
			
		}
		catch(Exception e){
			throw new CustomException("Invalid the list");
		}
		return Emp;
	}
	
	
	

}
