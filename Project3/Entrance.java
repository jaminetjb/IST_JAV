package improved.parking.plaza;

public class Entrance {

	//Variables
	String location; 	//North, South, East, West
	int size;
	boolean busesAllowed;
	
	public Entrance() {
		// TODO Auto-generated constructor stub
	}
	
	public Entrance(String location, int size, boolean busesAllowed) {
		location = location;
		size = size;
		busesAllowed = busesAllowed;
	}

}
