package in.co.capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//Create 5 diffferent objects of saving account and add them to arraylist.
public class TestSavingsAccount {

	public static void main(String[] args) {

		List<SavingAccount> savingaccount = new ArrayList<>();

		savingaccount.add(new SavingAccount(13_000, 101, "Ripu", true));
		savingaccount.add(new SavingAccount(18_000, 103, "Vivek", true));
		savingaccount.add(new SavingAccount(1_000, 102, "Shyam", false));
		savingaccount.add(new SavingAccount(25_000, 104, "Aman", true));
		savingaccount.add(new SavingAccount(10_000, 101, "Raju", true));

		// Displaying all SavingAccount's objects.
		for (SavingAccount savingAccount1 : savingaccount) {
			System.out.println(savingAccount1);
		}

	}

}
