package in.co.capgemini;

import java.util.Set;
import java.util.TreeSet;

//Class for maintaining SavingAccount's objects and dispalying it in sorted order and avoiding the duplicates.
public class BankAccountList {

	public static void main(String[] args) {

		// Creating Treeset.
		Set<SavingAccount> savingaccount = new TreeSet<>();

		savingaccount.add(new SavingAccount(13_000, 101, "Ripu", true));
		savingaccount.add(new SavingAccount(18_000, 102, "Vivek", true));
		savingaccount.add(new SavingAccount(1_000, 103, "Shyam", false));
		savingaccount.add(new SavingAccount(25_000, 104, "Aman", true));
		savingaccount.add(new SavingAccount(10_000, 101, "Raju", true));

		// Printing the object.
		for (SavingAccount savingAccount2 : savingaccount) {
			System.out.println(savingAccount2);
		}
	}

}
