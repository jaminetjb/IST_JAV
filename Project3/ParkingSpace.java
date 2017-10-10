package improved.parking.plaza;

public class ParkingSpace {

	//Variables
	private boolean isFree;
	private int level;
	private boolean chargingAvailable;
	private static int spaceNumber;
	private boolean isCompact;
	
	public void increment() {
		spaceNumber += spaceNumber;
	}
	
	public ParkingSpace() {
		increment();
		isFree = true;
		level = 0;
		chargingAvailable = false;
		spaceNumber = 0;
	}
	
	public ParkingSpace(boolean isFree, int level, boolean chargingAvaible, boolean isCompact) {
		increment();
		isFree = isFree;
		level = level;
		chargingAvailable = chargingAvailable;
		spaceNumber = spaceNumber;
		isCompact = isCompact;
	}
	
	public boolean isElectric() {
		if(chargingAvailable == true)
			return true;
		else
			return false;
	}
	
	public void makeElectric() {
		chargingAvailable = true;
	}
	
	public boolean isCompact() {
		if(isCompact == true)
				return true;
		else
			return false;
	}

}
