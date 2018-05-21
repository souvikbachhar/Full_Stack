package com.souvik.assignments;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ContractEmployee")
public class ContractEmployee extends Employee{
	
	private int allowance;

	public int getAllowance() {
		return allowance;
	}

	public void setAllowance(int allowance) {
		this.allowance = allowance;
	}
	
}
