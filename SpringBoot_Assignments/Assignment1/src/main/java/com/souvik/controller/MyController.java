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
	
	

}
