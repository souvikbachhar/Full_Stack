package com.souvik.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.dao.TransactionSummary;
import com.souvik.service.myService;

@RestController
public class myController {

	@Autowired
	 myService service;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody String sayHello(){
		return "hello";
	}
	@GetMapping("/checkcredentials")
	public  @ResponseBody int checkcredentials(@RequestParam("id") String id,@RequestParam("pwd") String password,@RequestParam("bank") String bank){
		return service.checkcredentials(id,password,bank);
	}
	
	@GetMapping("/checkbalance")
	public @ResponseBody Map<String,Object> checkBalance(@RequestParam("username") String username){
		return service.checkBalance(username);
	}
	
	@GetMapping("/checkuser")
	public  @ResponseBody int checkuser(@RequestParam("username") String uname,@RequestParam("userbank") String bank,@RequestParam("sender") String sender){
		return service.checkuser(uname,bank,sender);
	}
	
	@GetMapping("/transferfunds")
	public @ResponseBody Map<String,Object> transferfunds(@RequestParam("recieverrname") String recieverName,@RequestParam("recieverbank") String recieverBank,@RequestParam("transferamount") String transferAmount,@RequestParam("sender") String sender){
		
		return service.transferfunds(recieverName,recieverBank,transferAmount,sender);
		
	}
	@GetMapping("/transactionSummary")
	public  @ResponseBody List<TransactionSummary> transactionSummary(@RequestParam("sdate") String startDate,@RequestParam("edate") String endDate,@RequestParam("username") String userName){
		
		return service.transactionSummary(startDate,endDate,userName);
	}
}
