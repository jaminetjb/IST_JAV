/*
 * The class for cars.
 */
public class Car {
	String licensePlate;
	int ticketNum;
	boolean isHandicap;
	boolean isElectric;
	
	public void Car(){
		isHandicap = false;
		isElectric = false;
	}
	
	public void Car(String license, boolean isHandicap, boolean isElectric) {
		isHandicap = false;
		isElectric = false;
	}
	
	public void getTicket(int ticket) {
		ticketNum = ticket;
	}
}
