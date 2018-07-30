//Create a simple HashMap to store all of our class students' names and their favorite fruits.

package basic2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("Rahul", "Mango");
		map.put("Shyam", "apple");
		map.put("Udit", "Orange");
		map.put("Ripu", "Strawberrys");

		// Getting favorite fruit by giving their name.
		System.out.println("Favorite Fruit: " + map.get("Shyam"));
		System.out.println("Favorite Fruit: " + map.get("Rahul"));

		Set<Entry<String, String>> set = map.entrySet();

		// Printing all the names and their favorite fruit using entrySet() approach.
		for (Entry e : set) {
			System.out.println("Name: " + e.getKey() + " " + "Favorite Fruit: " + e.getValue());
		}
	}

}
