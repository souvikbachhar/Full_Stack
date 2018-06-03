package com.souvik.dao;

public class TransactionSummary {

	private int transactionId;
	private int userId;
	private int amount;
	private String transactionType;
	private String transactionRemarks;
	private int updatedBalance;
	private String transcationTime;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionRemarks() {
		return transactionRemarks;
	}
	public void setTransactionRemarks(String transactionRemarks) {
		this.transactionRemarks = transactionRemarks;
	}
	public int getUpdatedBalance() {
		return updatedBalance;
	}
	public void setUpdatedBalance(int updatedBalance) {
		this.updatedBalance = updatedBalance;
	}
	public String getTranscationTime() {
		return transcationTime;
	}
	public void setTranscationTime(String transcationTime) {
		this.transcationTime = transcationTime;
	}
	@Override
	public String toString() {
		return "TransactionSummary [transactionId=" + transactionId + ", userId=" + userId + ", amount=" + amount
				+ ", transactionType=" + transactionType + ", transactionRemarks=" + transactionRemarks
				+ ", updatedBalance=" + updatedBalance + ", transcationTime=" + transcationTime + "]";
	}
}
