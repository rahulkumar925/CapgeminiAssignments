//Create a class SavingAccount with fields acc_balance, acc_ID, accountHolderName,  isSalaryAccount. Also add setter and getter  methods with business
//method like withdraw and deposit.

package in.co.capgemini;

public class SavingAccount implements Comparable<SavingAccount> {

	private double acc_balance;
	private int acc_ID;
	private String accountHolderName;
	private boolean isSalaryAccount;

	public SavingAccount(double acc_balance, int acc_ID, String accountHolderName, boolean isSalaryAccount) {
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}

	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	public double withdraw(double amount) {

		acc_balance = acc_balance - amount;
		return acc_balance;
	}

	public double deposit(double amount) {

		acc_balance += amount;
		return acc_balance;
	}

	public int compareTo(SavingAccount s) {

		return this.acc_ID - s.acc_ID;
	}

	@Override
	public String toString() {
		return "SavingAccount [acc_balance= " + acc_balance + ", acc_ID= " + acc_ID + ", accountHolderName=  "
				+ accountHolderName + ", isSalaryAccount= " + isSalaryAccount + "]";
	}

}
