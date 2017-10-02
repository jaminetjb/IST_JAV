/*
 * This is the plaza are based on. The plaza can have a variety of parking spaces.
 * Parking spaces can be normal, handicap, or electric. 
 * Normal cars can only park in normal spaces, handicap in handicap, electric in electric.
 * When the parking lot is full, it is indicated with the boolean value isFull.
 */
public class Plaza {
	
	static Car spaces[] = new Car[100];;
	static HandicapCar handicapSpaces[] = new HandicapCar[10];
	static ElectricCar electricSpaces[] = new ElectricCar[6]; 
	static int ticket = 0;
	static boolean isHandicapFull;
	static boolean isSpacesFull;
	static boolean isElectricFull;

	static void increment() {
		ticket++;
	}
	
	public static void parkCar(Car car) {
		increment(); 
		boolean spotFound = false;
		if (car.isHandicap) {
			for(int h = 0; h < handicapSpaces.length; h++) {
				if (handicapSpaces[h] == null) {
					handicapSpaces[h] = (HandicapCar) car;
					car.getTicket(ticket);
					spotFound = true;
				}
				else {
					System.out.println("There are no more handicap car spaces left. Sorry!");
					isHandicapFull = true;
				}
			}
		}
		
		if(car.isElectric) {
			for(int e = 0; e < electricSpaces.length; e++) {
				if (electricSpaces[e] == null) {
					electricSpaces[e] = (ElectricCar) car;
					car.getTicket(ticket);
					spotFound = true;
				}
				else {
					System.out.println("There are no more electric car spaces left. Sorry!");
					isElectricFull = true;
				}
			}
		}
		
		else {
			for(int n = 0; n < spaces.length; n++) {
				if (spaces[n] == null) {
					spaces[n] = car;
					car.getTicket(ticket);
					spotFound = true;
				}
				else {
					System.out.println("There are no more car spaces left. Sorry!");
					isSpacesFull = true;
				}
			}
		}
		if(spotFound == true){
			System.out.println("Car has been parked!");	
		}
	}
	
	public static void getCar(int ticket) {
		boolean carFound = false;
		
		for(int a = 0; a < spaces.length; a++){
			if(spaces[a].ticketNum == ticket) {
				spaces[a] = null;
				carFound = true;
				isSpacesFull = false;
			}
		}
		
		for(int b = 0; b < handicapSpaces.length; b++){
			if(handicapSpaces[b].ticketNum == ticket) {
				handicapSpaces[b] = null;
				carFound = true;
				isHandicapFull = false;
			}
		}

		for(int c = 0; c < electricSpaces.length; c++){
			if(electricSpaces[c].ticketNum == ticket && electricSpaces[c] != null) {
				electricSpaces[c] = null;
				carFound = true;
				isElectricFull = false;
			}
		}
		
		if (carFound == true)
				System.out.println("Your car is ready!");
		
		else 
			System.out.println("There isn't a car with that ticket number.");
	}
	
	public static void isFull() {		
		if(isHandicapFull && isElectricFull && isSpacesFull)
			System.out.println("The parking deck is full.");
		else
			System.out.println("The parking deck is not full.");
	}
	
}
