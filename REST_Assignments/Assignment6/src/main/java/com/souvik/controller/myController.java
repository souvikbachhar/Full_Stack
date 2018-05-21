package com.souvik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.souvik.dto.Employee;
import com.souvik.service.myService;



@Controller
public class myController {

	@Autowired
	myService service;
	
	@GetMapping("getData")
	public @ResponseBody Employee getDataFromDb(@RequestParam("id") String id){

		return service.getDataFromService(id);
	}
	
	@GetMapping("getAllData")
	public @ResponseBody List<Employee> getAllDataFromDb(){

		return service.getAllDataFromService();
	}
	
	@DeleteMapping("deleteData")
	public @ResponseBody List<Employee> deleteFromDb(@RequestParam("id") String id){
		System.err.println(id);
		 service.deleteService(id);
		 return service.getAllDataFromService();
	}
	
	@PostMapping("updateData")
	public @ResponseBody List<Employee> updatedata(@RequestParam("id") String id,@RequestParam("salary") int sal){
		System.err.println(id+" "+sal);
		 return service.updateService(id,sal);
		 
	}
	
	@PutMapping("insertData")
	public @ResponseBody List<Employee> insertdata(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("salary") int sal){
		
		 return service.insertService(id,sal,name);
		
	}
	


}
