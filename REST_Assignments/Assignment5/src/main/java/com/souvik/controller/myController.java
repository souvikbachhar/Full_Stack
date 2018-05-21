package com.souvik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.myResult;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@RestController
public class myController {
	
	
	@GetMapping("/hello")
	public @ResponseBody String sayHello(){
		return "hello";
	}


	@GetMapping("/add")
	public @ResponseBody int add(@RequestParam("num1") int num1,@RequestParam("num2") int num2){		
	System.err.println("Reached");
		return num1+num2;
	}
	
	@GetMapping("/subtract")
	public @ResponseBody int subtract(@RequestParam("num1") int num1,@RequestParam("num2") int num2){		
	return num1-num2;
	}
}
