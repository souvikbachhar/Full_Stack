package com.souvik.assignments;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;



@Entity
@Table(name="EmployeePassport")
public class EmployeePassport {

	@Id @GeneratedValue(generator="newGenerator")
	@GenericGenerator(name = "newGenerator", strategy = "foreign",parameters = { @Parameter(value = "Empdata", name = "property") })
	private int empno;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmppassport() {
		return emppassport;
	}
	public void setEmppassport(String emppassport) {
		this.emppassport = emppassport;
	}
	private String  emppassport;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="empno")
	private Employee Empdata;
	public Employee getEmpdata() {
		return Empdata;
	}
	public void setEmpdata(Employee empdata) {
		Empdata = empdata;
	}
}
