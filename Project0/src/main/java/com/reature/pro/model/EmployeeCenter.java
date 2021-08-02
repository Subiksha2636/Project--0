package com.reature.pro.model;



public class EmployeeCenter {
	
	@Override
	public String toString() {
		return "EmployeeCenter [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", salary=" + salary
				+ ", ddtid=" + ddtid + ", gender=" + gender + "]";
	}
	private Integer  eid;
	private String ename;
	private String eaddress;
	private Double salary;
	private String ddtid;
	private String gender;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDdtid() {
		return ddtid;
	}
	public void setDdtid(String ddtid) {
		this.ddtid = ddtid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

	
}
