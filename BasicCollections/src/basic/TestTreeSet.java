//Add all the names of our class students randomly to a treeset, iterate
//through them and print.


package basic;

import java.util.Set;
import java.util.TreeSet;

//Test Class
public class TestTreeSet {

	public static void main(String[] args) {
       
		//Creating TreeSet.
		Set<String> names = new TreeSet<>();

		names.add("Shyam");
		names.add("Ankit");
		names.add("Jack");
		names.add("Vikash");
        
		//Iterating and printing
		for (String name : names) {
			System.out.println(name);
		}

	}

	class Student {

		String names;

		public Student(String names) {

			this.names = names;
		}

		@Override
		public String toString() {
			return "Student [names= " + names + "]";
		}

	}

}
