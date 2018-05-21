package com.souvik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository emprepo;
	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>) emprepo.findAll();
	}

	public List<Employee> getEmployee(Long id) {
		// TODO Auto-generated method stub
		return emprepo.findByempid(id);
	}

	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return emprepo.save(emp)!=null;
	}

	public boolean insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return emprepo.save(emp)!=null;
	}

	public void deleteEmployee(Long empid) {
		// TODO Auto-generated method stub
		emprepo.delete(empid);
	}

	public List<Employee> findByEmployeeName(String name) {
		// TODO Auto-generated method stub
		return emprepo.findByempnameIgnoreCase(name);
	}

	public List<Employee> permanentemployeescount() {
		// TODO Auto-generated method stub
		return emprepo.findByemployeetype("P");
	}

	public List<Employee> employeenamelike(String name) {
		// TODO Auto-generated method stub
		return emprepo.findByempnameLikeIgnoreCase(name);
	}
	
	
}
