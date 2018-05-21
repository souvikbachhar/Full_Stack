package com.souvik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.souvik.dto.ID;




@Controller
public class myController {
	
	
	@GetMapping("/hello")
	public @ResponseBody String sayHello(){
		return "hello";
	}
	
	@GetMapping("/getData")
	public @ResponseBody void getcalc(@RequestBody ID id){
		System.err.println(id.getFirst()+""+id.getSecond());
		
		//return id.getFirst()+id.getSecond();
	}
	
	@GetMapping("/add")
	public @ResponseBody int add(@RequestParam("id1") String id1,@RequestParam("id2") String id2){
		int a=Integer.parseInt(id1);
		int b=Integer.parseInt(id2);
		return a+b;
	}
}
