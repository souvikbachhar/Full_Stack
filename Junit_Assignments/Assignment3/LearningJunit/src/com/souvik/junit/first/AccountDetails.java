package com.souvik.junit.first;


public class AccountDetails {
	static int id=0;
	public int actNo(int ano)
	{	System.out.println(ano);
		return ano;
	}
	public String acctName(String name)
	{System.out.println(name);
		return name;
	}
	public float acctBal(float balance)
	{System.out.println(balance);
		return balance;
	}
	public String Deposit()
	{
		System.out.println("Deposit");
		return "Deposit";
	}
	public String Withdraw()
	{
		System.out.println("WithDraw");
		return "WithDraw";
	}
	public int creditcard()
	{
		++id;
		System.out.println("ID:"+id);
		return id;
	}
}
