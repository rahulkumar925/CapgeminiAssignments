package com.cg.bankaccount.service;

import java.util.Collection;

import com.cg.bankaccount.dao.BankAccountCollection;
import com.cg.bankaccount.pojo.CurrentAccount;
import com.cg.bankaccount.pojo.SavingsAccount;

public class BankAccountService {

	private BankAccountCollection dao = new BankAccountCollection();
	
	public void addSavingsAccount(SavingsAccount account) {
		
		dao.addSavingsAccount(account);
	}
	
 public void addCurrentAccount(CurrentAccount account) {
		
		dao.addCurrentAccount(account);
	}
	
 public Collection<SavingsAccount> viewSavings(){
	return dao.viewSavings();
 }
 
 public Collection<CurrentAccount> viewCurrent(){
		return dao.viewCurrent();
	 }
		
	
}
