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
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody String sayHello(){
		return "hello";
	}
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getAll() {
		return empservice.getAllEmployees();
	}
	
	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	public List<Employee> getOne(@PathVariable Long id) {
		return empservice.getEmployee(id);
	}
	

	@RequestMapping(value = "/employees/{emp}", method = RequestMethod.PUT)
	public HttpStatus update(@PathVariable Employee emp) {
		return empservice.updateEmployee(emp) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/employees/{emp}", method = RequestMethod.POST)
	public HttpStatus insert(@PathVariable Employee emp) {
		return empservice.insertEmployee(emp) ? HttpStatus.ACCEPTED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/employees/{empid}", method = RequestMethod.DELETE)
	public HttpStatus deleteemp(@PathVariable Long empid) {
		empservice.deleteEmployee(empid);
		return HttpStatus.NO_CONTENT;
	}
	
	@RequestMapping(value = "/findemployees/{name}", method = RequestMethod.GET)
	public List<Employee> findByEmployeeName(@PathVariable String name) {
		return empservice.findByEmployeeName(name);
	}
	
	@RequestMapping(value = "/employeescount", method = RequestMethod.GET)
	public int getAllcount() {
		return empservice.getAllEmployees().size();
	}
	
	@RequestMapping(value = "/permanentemployeescount", method = RequestMethod.GET)
	public int permanentemployeescount() {
		return empservice.permanentemployeescount().size();
	}
	
	@RequestMapping(value = "/employeenamelike/{name}", method = RequestMethod.GET)
	public List<Employee>  employeenamelike(@PathVariable String name) {
		return empservice.employeenamelike(name);
	}
}
