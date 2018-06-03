package com.souvik.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souvik.dao.TransactionSummary;
import com.souvik.repository.myRepository;

@Service
public class myService {
	
	@Autowired
	myRepository repository;
	
	public int checkcredentials(String id, String password, String bank) {
		return repository.checkcredentials( id,  password,bank);
	}

	public Map<String, Object> checkBalance(String username) {
		return repository.checkBalance(username);
	}

	public int checkuser(String uname, String bank, String sender) {
		return repository.checkuser(uname,bank,sender);
	}

	public Map<String, Object> transferfunds(String recieverName, String recieverBank, String transferAmount,
			String sender) {
		try{
			return repository.transferfunds(recieverName,recieverBank,transferAmount,sender);
		}
		catch(Exception e){
			e.printStackTrace();
			Map <String ,Object> result=new HashMap<String,Object>();
			result.put("TransactionStatus", "Failed");
			return result;
		}
	}

	public List<TransactionSummary> transactionSummary(String startDate, String endDate, String userName) {
		
		return repository.transactionSummary(startDate,endDate,userName);
	}
		

}
