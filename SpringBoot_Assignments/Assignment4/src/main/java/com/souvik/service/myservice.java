package com.souvik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.souvik.dto.Employee;
import com.souvik.repo.myRepository;

@Service
public class myservice {
	@Autowired
	myRepository repo;

	public int insertdata(Employee emp) {
		// TODO Auto-generated method stub

		System.out.println(emp.getEmployeeID());
		
		return repo.insertdata(emp);
	}

	public List<Employee> showall() {
		// TODO Auto-generated method stub
		return repo.showall();
	}

	public List<Employee> show(int id) {
		// TODO Auto-generated method stub
		return repo.show(id);
	}

}
