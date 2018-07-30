package basic;

import java.util.ArrayList;
import java.util.List;

//Create three different instances for each type and add them to a list.

class Laptop {

	String company;
	String model;
	String operatingSystem;
	String processor;

	public Laptop(String company, String model, String operatingSystem, String processor) {

		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop [company= " + company + ", model= " + model + ", operatingSystem= " + operatingSystem
				+ ", processor= " + processor + "]";
	}

}

class Car {

	String make;
	String model;
	int year;
	float price;

	public Car(String make, String model, int year, float price) {

		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [make= " + make + ", model= " + model + ", year= " + year + ", price= Rs. " + price + "]";
	}

}

class Television {

	String company;
	String type;
	boolean threedEnabled;
	float price;

	public Television(String company, String type, boolean threedEnabled, float price) {

		this.company = company;
		this.type = type;
		this.threedEnabled = threedEnabled;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Television [company= " + company + ", type= " + type + ", 3DEnabled= " + threedEnabled + ", price=Rs. "
				+ price + "]";
	}

}

class Cellphone {

	String company;
	String model;
	String description;
	String operatingSystem;
	float price;

	public Cellphone(String company, String model, String description, String operatingSystem, float price) {

		this.company = company;
		this.model = model;
		this.description = description;
		this.operatingSystem = operatingSystem;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cellphone [company= " + company + ", model= " + model + ", description= " + description
				+ ", operatingSystem= " + operatingSystem + ", price=Rs. " + price + "]";
	}

}

class School {

	String name;
	String city;
	String schooldistrict;
	int greatSchoolRanking;

	public School(String name, String city, String schooldistrict, int greatSchoolRanking) {

		this.name = name;
		this.city = city;
		this.schooldistrict = schooldistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	@Override
	public String toString() {
		return "School [name= " + name + ", city= " + city + ", schooldistrict= " + schooldistrict
				+ ", greatSchoolRanking= " + greatSchoolRanking + "]";
	}

}

class TestList {

	public static void main(String args[]) {
       
		//Creating list of type laptop.
		List<Laptop> laptop = new ArrayList<>();

		laptop.add(new Laptop("HP", "pavillion", "windows", "i3"));
		laptop.add(new Laptop("Dell", "inspiron", "ubuntu", "i5"));
		laptop.add(new Laptop("Lenovo", "Guru", "windows", "i7"));
		for (Laptop laptop1 : laptop) {
			System.out.println(laptop1);
		}
        
		//Creating list of type car.
		List<Car> car = new ArrayList<>();

		car.add(new Car("Ford", "Figo", 1972, 200000));
		car.add(new Car("Tata", "Indigo", 2006, 800000));
		car.add(new Car("Audi", "A4", 2006, 2500000));

		for (Car car1 : car) {
			System.out.println(car1);
		}
        
		//Creating list of type television.
		List<Television> television = new ArrayList<>();

		television.add(new Television("LG", "LED", false, 20000));
		television.add(new Television("Sony", "Plasma", true, 50000));
		television.add(new Television("Samsung", "LCD", false, 12000));

		for (Television television1 : television) {
			System.out.println(television1);
		}
        
		//Creating list of type cellphone.
		List<Cellphone> cellphone = new ArrayList<>();

		cellphone.add(new Cellphone("Samsung", "S8", "User-Friendly", "android", 80000));
		cellphone.add(new Cellphone("Oppo", "F7", "Selfie-Specialist", "android", 20000));
		cellphone.add(new Cellphone("Vivo", "V9", "Battery-Marathon", "android", 23000));

		for (Cellphone cellphone1 : cellphone) {
			System.out.println(cellphone1);
		}
        
		
		//Creating list of type school.
		List<School> school = new ArrayList<>();

		school.add(new School("DAV", "Delhi", "New Delhi", 3));
		school.add(new School("DPS", "Patna", "Patna", 1));
		school.add(new School("Ryan", "Gr. Noida", "Gr. Noida", 2));

		for (School school1 : school) {
			System.out.println(school1);
		}
	}
}
