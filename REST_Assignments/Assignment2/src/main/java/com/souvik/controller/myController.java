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
	public @ResponseBody myResult check(@RequestParam("date1") String date1,@RequestParam("date2") String date2){
		System.err.println(date1);
		System.err.println(date2);
	    String[] d1=date1.split(" ");
	    String[] d2=date2.split(" ");
	    System.out.println(d1[1]);
	    int a=0,b=0;
	    switch(d1[1]){
	    case "Jan" : a=1;
					break;

	    case "Feb" : a=2;
					break;

	    case "Mar" : a=3;
					break;

	    case "Apr" : a=4;
					break;

	    case "May" : a=5;
					break;

	    case "Jun" : a=6;
					break;

	    case "Jul" : a=7;
					break;

	    case "Aug" : a=8;
					break;

	    case "Sep" : a=9;
					break;

	    case "Oct" : a=10;
					break;

	    case "Nov" : a=11;
					break;

	    case "Dec" : a=12;
					break;
	    }
	    switch(d2[1]){
	    case "Jan" : b=1;
					break;

	    case "Feb" : b=2;
					break;

	    case "Mar" : b=3;
					break;

	    case "Apr" : b=4;
					break;

	    case "May" : b=5;
					break;

	    case "Jun" : b=6;
					break;

	    case "Jul" : b=7;
					break;

	    case "Aug" : b=8;
					break;

	    case "Sep" : b=9;
					break;

	    case "Oct" : b=10;
					break;

	    case "Nov" : b=11;
					break;

	    case "Dec" : b=12;
					break;
	    }
	    myResult mr=new myResult();
	    LocalDate da1 = LocalDate.of(Integer.parseInt(d1[3]),a , Integer.parseInt(d1[2]));
	    LocalDate da2 = LocalDate.of(Integer.parseInt(d2[3]),b , Integer.parseInt(d2[2]));
	    String result=Period.between(da1, da2).getYears()+" Year(s) "+Period.between(da1, da2).getMonths()+" Month(s) "+Period.between(da1, da2).getDays()+" Day(s)";
	    mr.setRes(result);
	    
	    System.out.println(mr.getRes());
	return mr;
	}
}
