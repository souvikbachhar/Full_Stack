package com.souvik.controller;

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


	@GetMapping("/check")
	public @ResponseBody int check(@RequestParam("num") int num){

	return num*2;
	}
}
