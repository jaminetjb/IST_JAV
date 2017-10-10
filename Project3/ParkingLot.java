package improved.parking.plaza;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ParkingLot {

	public ParkingLot() {
		
	}

	public static void main(String[] args) {
		
		
		ParkingLot pl = null;
		ArrayList<ParkingLevel> parkingLot = new ArrayList(10);
		int floorLevel = 0;
		
		Scanner Input = null;
		try {
			Input = new Scanner(new File(args[0]));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		while (Input.hasNextLine()) {
			String inputLine = Input.nextLine(); //using the next line of the file, creates a string made up of the line
			
			System.out.println(inputLine);
			Scanner line = new Scanner(inputLine);
			
			
			if(line.hasNext("Floor")) {
				line.next();
				floorLevel = line.nextInt();
				parkingLot.add(floorLevel-1, new ParkingLevel(floorLevel));
				System.out.println("The floor level has been set to " + floorLevel);
			}
			
			//if has 3 ints in the line 
			if(line.hasNext("Total")) {
				line.next(); 	//skip total
				parkingLot.get(floorLevel-1).makeParkingSpace(line.nextInt());
				System.out.println("Level " + floorLevel + " now has " + parkingLot.get(floorLevel-1).size() + " parking spaces.");
			}
			
			if(line.hasNext("Compact")){ 
				line.next();
				int numCompact = line.nextInt();
				for(int c = 0; c < 0; c++) {
					parkingLot.get(floorLevel-1).makeCompactSpace();
				}
				System.out.println("Just made " + numCompact + " spaces Compact spaces.");
			}

			if(line.hasNext("Electric")){ 
				line.next();
				int numElectric = line.nextInt();
				for(int e = 0; e < 0; e++) {
					parkingLot.get(floorLevel-1).makeElectricSpace();
				}
				System.out.println("Just made " + numElectric + " spaces Electric spaces.");
			}
			
			if(line.hasNext("Entrance")) {
				line.next();
				String direction = line.next();
				int size = line.nextInt();
				boolean busAllowed = line.nextBoolean();
				parkingLot.get(floorLevel-1).addEntrance(direction, size, busAllowed);
				System.out.println("Added an Entrance to floor " + floorLevel);
			}
			
			if(line.hasNext("Exit")) {
				line.next();
				String direction = line.next();
				int size = line.nextInt();
				boolean busAllowed = line.nextBoolean();
				parkingLot.get(floorLevel-1).addExit(direction, size, busAllowed);
				System.out.println("Just added an Exit to floor " + floorLevel);
			}
			
			System.out.println("THIS IS THE BOTTOM OF THE WHILE LOOP");
		}
		
		//Eventually, load a file with cars coming in and out
		/*
		Scanner carReport = null;
		
		try {
			carReport = new Scanner(new File(args[1]));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/		
	}
}
