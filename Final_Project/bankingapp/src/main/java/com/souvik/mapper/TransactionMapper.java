package com.souvik.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.souvik.dao.TransactionSummary;



public class TransactionMapper implements RowMapper<TransactionSummary>{

	@Override
	public TransactionSummary mapRow(ResultSet rs, int rowNum) throws SQLException {
		TransactionSummary transactionSummary = new TransactionSummary();
		transactionSummary.setTransactionId(Integer.parseInt(rs.getString("Transaction_Id")));
		transactionSummary.setUserId(Integer.parseInt(rs.getString("ID")));
		transactionSummary.setAmount(Integer.parseInt(rs.getString("AMOUNT")));
		transactionSummary.setTransactionType(rs.getString("TRANSACTION_TYPE"));
		transactionSummary.setTransactionRemarks(rs.getString("TRANSACTION_REMARKS"));
		transactionSummary.setUpdatedBalance(Integer.parseInt(rs.getString("UPDATED_BALANCE")));
		transactionSummary.setTranscationTime(rs.getString("TRANSACTION_TIME"));
		return transactionSummary;
	}

}
