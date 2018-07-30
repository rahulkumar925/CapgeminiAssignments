
//LinkeddHashSet: Add all the names of class student randomly to a LinkedHashSet, iterate through them and print.
//Observe that LinkedHashSet is maintaining the order that you add.
package basic;

import java.util.LinkedHashSet;
import java.util.Set;

//Test Class.
public class TestLinkedHashSet {

	public static void main(String[] args) {

		// Creating LinkedHashset of class student.
		Set<Student> students = new LinkedHashSet<>();

		// Adding names.
		students.add(new Student("Ankit"));
		students.add(new Student("Ashish"));
		students.add(new Student("Naveen"));
		students.add(new Student("Prabhat"));

		// Printing names.
		for (Student student : students) {
			System.out.println(student);
		}
	}
}

class Student {

	String name;

	public Student(String name) {

		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [Name= " + name + "]";
	}

}
