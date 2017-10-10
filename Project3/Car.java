package improved.parking.plaza;

public class Car extends Vehicle {

	//Variable
	private String license;
	private int numOfSpaces;
	private int size;
	
	boolean isCompact;
	boolean isElectric;
	
	public Car() {
		license = "0000000";
		numOfSpaces = 1;
		size = 1;
		isCompact = false;
		isElectric = false;
	}
	
	public Car(String lic, int spaces, int sz, boolean compact, boolean electric) {
		license = lic;
		numOfSpaces = spaces;
		size = sz;
		isCompact = compact;
		isElectric = electric;
	}

}
