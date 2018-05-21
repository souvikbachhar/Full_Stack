package com.souvik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

	
	@GetMapping("/check")
	public  @ResponseBody int check(@RequestParam("cardno") int cardno){
		System.err.println("Reached");
		if((cardno%2)==0)
		{
			return 1;
		}
		else{
			return 0;	
		}
		
		
	}
	
}
