package com.souvik;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeJpa")
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
	private Long empid;
	private String empname;
	private Date empdoj;
	private Float emptotalsalary;
	private String employeetype;
	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Date getEmpdoj() {
		return empdoj;
	}
	public void setEmpdoj(Date empdoj) {
		this.empdoj = empdoj;
	}
	public Float getEmptotalsalary() {
		return emptotalsalary;
	}
	public void setEmptotalsalary(Float emptotalsalary) {
		this.emptotalsalary = emptotalsalary;
	}
	public String getEmployeetype() {
		return employeetype;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdoj=" + empdoj + ", emptotalsalary="
				+ emptotalsalary + ", employeetype=" + employeetype + "]";
	}
	public void setEmployeetype(String employeetype) {
		employeetype = employeetype;
	}
}
