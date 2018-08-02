package com.capgemini.employeeinfo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
//Test Class
public class TestEmpSaving {

	public static void main(String[] args) {
                //Creating objects of Employee and their accounts.		
		EmployeeInformation emp = new EmployeeInformation();
		MMASavingAccount account = new MMASavingAccount();
		
		emp.setEmpId(101);
		emp.setEmpName("Raja");
		emp.setEmpDesig("Clerk");
		emp.setEmpSalary(20_000);
		emp.setEmployeeComm(5_000);
		
		account.setAccountID(1001);
		account.setAccHolder("Raja");
		account.setAccountBalance(40_000);
		account.setSalaryAccount(true);
		
	        //Creating objects of employee and their accounts.
		EmployeeInformation emp2 = new EmployeeInformation();
		MMASavingAccount account2 = new MMASavingAccount();
		
		emp2.setEmpId(102);
		emp2.setEmpName("Raman");
		emp2.setEmpDesig("Manager");
		emp2.setEmpSalary(50_000);
		emp2.setEmployeeComm(12_000);
		
		account2.setAccountID(1002);
		account2.setAccHolder("Raman");
		account2.setAccountBalance(100_000);
		account2.setSalaryAccount(true);
		
                //Creating HashMap of Employee and MMASavingAccount.
		Map<EmployeeInformation,MMASavingAccount> info = new HashMap<>();
		
                //putting objects of employee and account in HashMap
		info.put(emp, account);
		info.put(emp2, account2);
		
       info.forEach((employee,acc) -> System.out.println("Employee: "+employee+"\n Account : "+acc+ "\n"));
		

	}

}
