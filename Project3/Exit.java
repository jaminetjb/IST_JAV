package improved.parking.plaza;

public class Exit {

	//Variable
	String location; 	//North, South, East, West
	int size;
	boolean busesAllowed;
	
	public Exit(String location, int size, boolean busesAllowed) {
		location = location;
		size = size;
		busesAllowed = busesAllowed;
	}

}
