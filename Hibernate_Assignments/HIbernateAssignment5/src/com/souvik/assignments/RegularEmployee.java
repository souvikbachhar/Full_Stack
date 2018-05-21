package com.souvik.assignments;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="RegularEmployee")
public class RegularEmployee extends Employee{
	
	private int qplc;

	public int getQplc() {
		return qplc;
	}

	public void setQplc(int qplc) {
		this.qplc = qplc;
	}
}
