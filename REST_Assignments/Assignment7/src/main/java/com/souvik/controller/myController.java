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
	
	static int bal=5000;


	@GetMapping("/getBalance")
	public @ResponseBody int add(){		
	System.err.println("Reached");
		return bal;
	}
	
	@GetMapping("/deposit")
	public @ResponseBody int deposit(@RequestParam("dep") int dep){		
	System.err.println("Reached");
		return bal+dep;
	}
	
	@GetMapping("/withdraw")
	public @ResponseBody int withdraw(@RequestParam("w") int w){		
	System.err.println("Reached w");
		return bal-w;
	}

}
