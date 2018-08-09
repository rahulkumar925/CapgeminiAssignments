
//Program to Test the Person class.

import java.time.Period;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Ram", 12, 3, 1982);
		Person person2 = new Person("Shyam", 7, 5, 1987);

		Period period;
		period = Person.age(person1);
		System.out.println(person1 + "\n Age:  " + period.getYears() + " years " + period.getMonths() + " months "
				+ period.getDays() + " days.");

		Period period2;
		period2 = Person.age(person2);
		System.out.println(person2 + "\n Age:  " + period2.getYears() + " years " + period2.getMonths() + " months "
				+ period2.getDays() + " days.");

		Period period3;
		period3 = Person.olderOne(person1, person2);
		System.out.printf("Difference is %d years, %d months and %d days old", period3.getYears(), period3.getMonths(),
				period3.getDays());

	}

}
