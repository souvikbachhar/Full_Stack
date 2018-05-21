package com.souvik.mycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.souvik.dto.Employee;
import com.souvik.service.myservice;

@Controller
public class myController {
	
	
	@Autowired
	myservice service;
	
	@GetMapping("/index")
	public  String health(){
		return "index";
	}
	
	@PostMapping("/insertData")
	public  @ResponseBody int insertdata(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("salary") int salary){
		Employee emp = new Employee();
		emp.setEmployeeID(id);
		emp.setEmployeeName(name);
		emp.setEmployeeSalary(salary);
		System.out.println(emp.getEmployeeID());
		return service.insertdata(emp);
		
	}
	
	@GetMapping("/displayAll")
	public  @ResponseBody List<Employee> displayAll(){
		return service.showall();
		
	}
	
	@GetMapping("/display/{id}")
	public  @ResponseBody List<Employee> display(@PathVariable int id){
		System.err.println(id);
		return service.show(id);
		
	}
}
