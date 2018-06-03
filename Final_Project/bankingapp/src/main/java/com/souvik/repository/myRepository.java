package com.souvik.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.souvik.dao.TransactionSummary;
import com.souvik.mapper.TransactionMapper;

@Repository
public class myRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("myOracleDs")
	DataSource myDs;
	
	public int checkcredentials(String id, String password, String bank) {
		System.err.println("id->"+id+" password->"+password+" bank->"+bank);
		jdbcTemplate.setDataSource(myDs);
		try
		{return jdbcTemplate.queryForObject("select count(*) from bank_users where user_name=? and user_password=? and user_bank=?",new Object[]{id,password,bank},Integer.class);
		
		}
		catch(Exception e)
		{	e.printStackTrace();
			return 0;
		}
	}

	public Map<String, Object> checkBalance(String username) {
		Map<String,Object> result= new HashMap<String,Object>();
		try{
			jdbcTemplate.setDataSource(myDs);
			result.put("userbalance",jdbcTemplate.queryForObject("select user_balance from bank_user_balance where USER_ID =(select USER_ID from bank_users where USER_NAME=?)",new Object[]{username},Integer.class));
	}
		catch(Exception e){
			e.printStackTrace();
			result.put("balance", null);
		}
		return result;
	}

	public int checkuser(String uname, String bank, String sender) {
		System.err.println("id->"+uname+" bank->"+bank);
		jdbcTemplate.setDataSource(myDs);
		try
		{return jdbcTemplate.queryForObject("select count(*) from bank_users where user_name=?  and user_bank=? and user_name <> ?",new Object[]{uname,bank,sender},Integer.class);
		
		}
		catch(Exception e)
		{	e.printStackTrace();
			return 0;
		}
	}
	
	@Transactional
	public Map<String, Object> transferfunds(String recieverName, String recieverBank, String transferAmount,
			String sender) {
		System.err.println("recieverName->"+recieverName+"receiverBank->"+recieverBank+"Amount->"+transferAmount+"Sender->"+sender);
		Map <String ,Object> result=new HashMap<String,Object>();
		
			jdbcTemplate.setDataSource(myDs);
			
			jdbcTemplate.update("update bank_user_balance set user_balance= user_balance-? where user_id="
					+ "(select user_id from bank_users where user_name=?)",new Object[]{transferAmount,sender});
			
			jdbcTemplate.update("insert into bank_transactions values((select max(transaction_id)+1 "
					+ "from bank_transactions),"
					+ "(select user_id from bank_users where user_name=?),?,'debit',?,"
					+ "(select user_balance from bank_user_balance where user_id="
					+ "(select user_id from bank_users where user_name=?)),sysdate)"
					,new Object[]{sender,transferAmount,"Amount Transferred to : "+recieverName,sender});

			
			jdbcTemplate.update("update bank_user_balance set user_balance= user_balance+? where user_id="
					+ "(select user_id from bank_users where user_name=?)",new Object[]{transferAmount,recieverName});
			
			jdbcTemplate.update("insert into bank_transactions values((select max(transaction_id)+1"
					+ " from bank_transactions),"
					+ "(select user_id from bank_users where user_name=?),?,'credit',?,"
					+ "(select user_balance from bank_user_balance where user_id="
					+ "(select user_id from bank_users where user_name=?)),sysdate)"
					,new Object[]{recieverName,transferAmount,"Amount Received From :"+sender,recieverName});
			
			result.put("TransactionStatus", "Successful");
		
		
		
		return result;
	}

	public List<TransactionSummary> transactionSummary(String startDate, String endDate, String userName) {
		jdbcTemplate.setDataSource(myDs);
		try{
			return jdbcTemplate.query("select * from BANK_TRANSACTIONS "
					+ "where ID=(select user_ID from bank_users where user_name=?) and "
					+ "TRANSACTION_TIME between ? and ? order by transaction_id desc" ,new Object[]{userName,startDate,endDate},new TransactionMapper());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

}
