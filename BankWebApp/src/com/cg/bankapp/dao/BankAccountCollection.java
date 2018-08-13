package com.cg.bankapp.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.bankapp.pojo.BankAccount;


public class BankAccountCollection {

	private Map <Integer, BankAccount> bankDB = new HashMap<>();
	

	public Collection<BankAccount> viewBankAccount() {
		bankDB.put(1,new BankAccount(201,"Rahul","rahul@gmail.com","9973156223","11/11/1997",20000,45000));
		bankDB.put(2,new BankAccount(202,"Shyam","shyam01@gmail.com","9833156223","10/10/1996",17000,33000));
		bankDB.put(3,new BankAccount(203,"Akash","okayakash@gmail.com","9855463214","09/08/1997",25000,20000));
		bankDB.put(4,new BankAccount(204,"Ripu","ripui23@gmail.com","9970897643","11/12/1998",23000,10000));
		bankDB.put(5,new BankAccount(205,"Aman","aman@gmail.com","7742131211","03/03/1990",21000,13000));
		return bankDB.values();
	}



	public double withdraw(double amount, int accountNumber) {
		Integer i = accountNumber;
		if(bankDB.get(i).getAccountBalance()>amount) {
		bankDB.get(i).setAccountBalance(bankDB.get(i).getAccountBalance()-amount);
		return bankDB.get(i).getAccountBalance();
		}
		else {
		return -1;
	}
	}

}
