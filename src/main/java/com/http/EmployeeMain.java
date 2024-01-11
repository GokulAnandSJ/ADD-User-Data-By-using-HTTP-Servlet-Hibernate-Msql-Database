package com.http;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.*;
@Table( name = "EMPLOYEE")
@Entity

public class EmployeeMain {

	
	@Id
	@Column(name = "EmpID")
	private int empId;
	@Column(name = "EmpName")
	private String empName;
	@Column(name = "EmpEmail")
	private String empEmail;
	@Column(name = "EmpAddress")
	private String empAddress;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
}
