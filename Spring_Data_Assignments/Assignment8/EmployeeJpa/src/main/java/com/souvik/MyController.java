package com.souvik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	EmployeeService empservice;
	
	@Autowired
	EmployeeRepository emprepo;
	

	
	@RequestMapping(value = "/employeenamelikeusingquerydsl/{name}", method = RequestMethod.GET)
	public List<Employee>  employeenamelikeusingquerydsl(@PathVariable String name) {
		return empservice.findEmployeeByNameQueryDsl(emprepo,name);
	}
	
	@RequestMapping(value = "/employeeallusingquerydsl", method = RequestMethod.GET)
	public List<Employee>  employeeallusingquerydsl() {
		return empservice.employeeallusingquerydsl(emprepo);
	}
	
	@RequestMapping(value = "/employeebyidusingquerydsl/{name}", method = RequestMethod.GET)
	public List<Employee>  employeebyidusingquerydsl(@PathVariable Long name) {
		return empservice.employeebyidusingquerydsl(emprepo,name);
	}
}
