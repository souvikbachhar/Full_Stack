package com.souvik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.souvik.dao.myRepository;
import com.souvik.dto.Employee;

@Service
public class myService {
	@Autowired
	myRepository repo;

	public Employee getDataFromService(String id) {
		// TODO Auto-generated method stub
		return repo.getValueFromDao(id);
	}

	public List<Employee> getAllDataFromService() {
		// TODO Auto-generated method stub
		return repo.getAllValueFromDao();
	}

	public List<Employee> deleteService(String id) {
		// TODO Auto-generated method stub
		return repo.deletefromDao(id);
	}

	public List<Employee> updateService(String id,int sal) {
		// TODO Auto-generated method stub
		return repo.updateFromDao(id,sal);
	}

	public List<Employee> insertService(String id, int sal, String name) {
		// TODO Auto-generated method stub
		return repo.insertFromDao(id,sal,name);
	}
}
