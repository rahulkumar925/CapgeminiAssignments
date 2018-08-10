package com.cg.bankaccount.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.bankaccount.pojo.CurrentAccount;
import com.cg.bankaccount.pojo.SavingsAccount;

public class BankAccountCollection {
	
	private Map <Integer, SavingsAccount> savingsDB = new HashMap<>();
	
	private Map<Integer, CurrentAccount> currentDB = new HashMap<>();
	
	public void addSavingsAccount(SavingsAccount account) {
		savingsDB.put(account.getAccountNumber(), account);
	}
	
	public void addCurrentAccount(CurrentAccount account) {
		currentDB.put(account.getAccountNumber(), account);
	}
	
	
	public Collection<SavingsAccount> viewSavings(){
		return savingsDB.values();
	}
	
	public Collection<CurrentAccount> viewCurrent(){
		return currentDB.values();
	}

}
