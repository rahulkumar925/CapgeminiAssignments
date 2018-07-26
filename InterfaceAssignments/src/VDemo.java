//Define an interface Vehicle with start() function. Now derive classes like TwoWheeler, ThreeWheeler etc. from vehicle and override start() function. 
//Define a VDemo in which write main() function.

interface Vehicle {

	void start();

}

class TwoWheeler implements Vehicle {

	@Override
	public void start() {
		System.out.println("Two wheeler vehicle.");
	}
}

class ThreeWheeler implements Vehicle {

	@Override
	public void start() {
		System.out.println("Three wheeler vehicle.");
	}
}

class FourWheeler implements Vehicle {

	@Override
	public void start() {
		System.out.println("Four wheeler vehicle.");
	}
}


//Test Class
class VDemo {

	public static void main(String[] args) {

		TwoWheeler twowheeler = new TwoWheeler();
		ThreeWheeler threewheeler = new ThreeWheeler();
		FourWheeler fourwheeler = new FourWheeler();
        
		//Creating array of Vehicle and storing instances of sub classes.
		Vehicle[] vehicle = { twowheeler, threewheeler, fourwheeler };
        
		//Condition to call start only if there is a class Three Wheeler.
		for (int i = 0; i < vehicle.length; i++) {
			if (vehicle[i] == threewheeler) {
				vehicle[i].start();
			}
		}

	}

}
