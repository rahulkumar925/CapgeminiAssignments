package com.cg.bankaccount.pojo;


public abstract class BankAccount {

	private final int accountNumber;
	private Customer accountHolder;
	private double accountBalance;
	
	private static  int accountId;
	
	static {
		accountId=100;
	}
	
	{
		this.accountNumber = ++accountId;
	}

	public BankAccount(Customer accountHolder, double accountBalance) {
		super();
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	public BankAccount(Customer accountHolder) {
		super();
		this.accountHolder = accountHolder;
	}

	public Customer getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public static int getAccountId() {
		return accountId;
	}

	public static void setAccountId(int accountId) {
		BankAccount.accountId = accountId;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + "]";
	}
	
		
	
}
