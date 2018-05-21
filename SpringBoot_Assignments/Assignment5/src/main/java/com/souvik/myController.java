package com.souvik;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {

	@Autowired
	EmployeeData empdata;
	
	@GetMapping("home")
	public @ResponseBody String hello()
	{
		return "hello";
	}
	
	@GetMapping("showall")
	public @ResponseBody Map<Integer, Employee> showall()
	{
		
		return empdata.getM();
	}
	
	@GetMapping("show/{id}")
	public @ResponseBody Employee show(@PathVariable int id)
	{   return empdata.getemp(id);
	}
	
	@PostMapping("add")
	public @ResponseBody Map<Integer, Employee> addEmployee(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("locn") String locn)
	{   
		empdata.addemployee(id,name,email,locn);
		return empdata.getM();
	}
	
	@PutMapping	("update")
	public @ResponseBody Map<Integer, Employee> updateEmployee(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("locn") String locn)
	{   
		empdata.addemployee(id,name,email,locn);
		return empdata.getM();
	}
	
	@DeleteMapping	("delete/{id}")
	public @ResponseBody Map<Integer, Employee> deleteEmployee(@PathVariable int id)
	{   
		empdata.deleteEmployee(id);
		return empdata.getM();
	}
}
