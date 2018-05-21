package com.souvik.assignments;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPDEPARTMENT")
public class Department {
	@Id @GeneratedValue
	private int deptno;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public	void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	private String deptname;
}
