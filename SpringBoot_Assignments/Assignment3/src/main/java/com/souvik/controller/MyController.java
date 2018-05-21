package com.souvik.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@GetMapping("/bankname")
	public @ResponseBody String sayName(){
		return "Bank Name: ICICI";
	}
	
	@GetMapping("/bankaddress")
	public @ResponseBody String sayAddress(){
		return "Bank Address: ICICI,Bengaluru";
	}
	
	@GetMapping("/bankbranches")
	public String bankaddress(){
		return "final";
	}
	
	@GetMapping("/bankservices")
	public String bankservices(){
		return "BankServices";
	}
	
	@GetMapping("/health")
	public @ResponseBody String health(){
		return "Health Status: OK";
	}
}
