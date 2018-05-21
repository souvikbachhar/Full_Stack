package com.souvik;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository<E> extends CrudRepository<Employee, Long> {

	List<Employee> findByempid(Long Id);
	
	List<Employee> findByempnameIgnoreCase(String name);

}
