package improved.parking.plaza;

public class Bike extends Vehicle {

	//Variables
	String license;
	int numOfSpaces;
	int size;
		
	boolean isMotorcycle;
	
	public Bike() {
		license = "000000";
		numOfSpaces = 1;
		size = 1;
		isMotorcycle = false;
	}
	
	public Bike(String license, int numOfSpaces, int size, boolean isMotorcycle) {
		license = license;
		numOfSpaces = numOfSpaces;
		size = size;
		isMotorcycle = isMotorcycle;
	}

}
