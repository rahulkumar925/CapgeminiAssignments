//Create MMASavingAccount with fields accountid, accountholder_name, account_balance, isSalaryAccount with their setters and getter methods.

package com.capgemini.employeeinfo;

public class MMASavingAccount {
	
	int accountID;
	String accHolder;
	double accountBalance;
	boolean isSalaryAccount;
	
	public int getAccountID() {
		return accountID;
	} 
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	@Override
	public String toString() {
		return "MMASavingAccount [accountID=" + accountID + ", accHolder=" + accHolder + ", accountBalance="
				+ accountBalance + ", isSalaryAccount=" + isSalaryAccount + "]";
	}
	
	
	

}
