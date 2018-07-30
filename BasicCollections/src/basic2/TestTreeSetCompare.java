//create few instances of car and add them to a treeset. Implements comparable interface and override
//compaereTo() to order them by ascending order of make of the car.

package basic2;

import java.util.Set;
import java.util.TreeSet;

//Test class
public class TestTreeSetCompare {

	public static void main(String[] args) {

		Set<Car> car = new TreeSet<>();
		car.add(new Car("Ford"));
		car.add(new Car("Tata Motors"));
		car.add(new Car("Hyundai"));
		car.add(new Car("Honda"));

		for (Car car1 : car) {
			System.out.println(car1);
		}

	}

}

//class Car implementing comparable interface.
class Car implements Comparable<Car> {

	public String make;

	public Car(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Car [make= " + make + "]";
	}

	@Override
	public int compareTo(Car c) {

		return this.make.compareTo(c.make);

	}

}
