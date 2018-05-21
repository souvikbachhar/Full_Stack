package com.souvik;

public class Employee {
	private String EmployeeName;
	private String EmployeeEmail;
	private String EmployeeLocation;

	
	public Employee(String EmployeeName, String EmployeeEmail, String EmployeeLocation) {
		// TODO Auto-generated constructor stub
		this.EmployeeName=EmployeeName;
		this.EmployeeEmail=EmployeeEmail;
		this.EmployeeLocation=EmployeeLocation;
		
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return EmployeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		EmployeeEmail = employeeEmail;
	}
	public String getEmployeeLocation() {
		return EmployeeLocation;
	}
	public void setEmployeeLocation(String employeeLocation) {
		EmployeeLocation = employeeLocation;
	}
	
}
