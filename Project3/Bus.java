package improved.parking.plaza;

public class Bus extends Vehicle {

	//Variable
	private String license;
	private int numOfSpaces;
	private int size;
	
	private String busType;
	
	public Bus() {
		license = "0000000";
		numOfSpaces = 1;
		size = 1;
		busType = "notSpecified";
	}
	
	public Bus(int license, int numOfSpaces, int size, String busType) {
		license = license;
		numOfSpaces = numOfSpaces;
		size = size;
		busType = busType;
	}
}