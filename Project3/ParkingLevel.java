package improved.parking.plaza;

import java.util.ArrayList;

public class ParkingLevel {

	//Variables
	ParkingSpace[] spaces; 
	ArrayList<Exit> exits = new ArrayList();
	ArrayList<Entrance> entrances = new ArrayList();
	boolean isFull;
	int floorNumber;
	
	public ParkingLevel(int numOfSpaces, int numOfExits, int numOfEntrances, int floorNumber) {
		spaces = new ParkingSpace[numOfSpaces];
		isFull = false;
	}
	
	public ParkingLevel(int floorNumber) {
		floorNumber = floorNumber;
	}
	
	public int size() {
		return spaces.length;
	}
	
	public void makeParkingSpace(int numSpaces) {
		if(isFull) {
			System.out.println("Another Parking Space cannot be added to level " + floorNumber);
		}
		else {
			//create the full array of parking spaces 
			spaces = new ParkingSpace[numSpaces];
			//find a null spot in the spaces
			for(int n = 0; n < spaces.length; n++) {
				if(spaces[n] == null){
					spaces[n] = new ParkingSpace();
				}
				if(n == spaces.length-1) {
					isFull = true;
				}
			}
		}
	}
	
	public void makeElectricSpace() {
		if(isFull) {
			System.out.println("Another Eletric Parking Space cannot be added to level " + floorNumber);
		}
		else {
			//find a null spot in the spaces
			for(int n = 0; n < spaces.length; n++) {
				if(spaces[n].isElectric() == false && spaces[n].isCompact() == false)
					spaces[n].makeElectric();
				if(n == spaces.length-1) {
					isFull = true;
				}
			}
		}
	}		
	
	public void makeCompactSpace(){
		if(isFull) {
			System.out.println("Another Eletric Parking Space cannot be added to level " + floorNumber);
		}
		else {
			//find a null spot in the spaces
			for(int n = 0; n < spaces.length; n++) {
				if(spaces[n].isCompact() == false && spaces[n].isElectric() == false)
					spaces[n].makeElectric();
				if(n == spaces.length-1) {
					isFull = true;
				}
			}
		}		
	}

	public void addEntrance(String location, int size, boolean busesAllowed) {
		Entrance ent = new Entrance(location, size, busesAllowed);
		entrances.add(ent);
	}
	
	public void addExit(String location, int size, boolean busesAllowed) {
		Exit e = new Exit(location, size, busesAllowed);
		exits.add(e);
	}
}
