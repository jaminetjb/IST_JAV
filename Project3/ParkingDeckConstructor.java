package improved.parking.plaza;

import java.util.Scanner;

public class ParkingDeckConstructor {

	public ParkingDeckConstructor() {

	}
	
	public static void main(String[] args) {
			System.out.println("We're going to build a parking deck. \n How many floors will it have? (Please enter a positive int variable).");
			Scanner input = new Scanner(System.in);
			int Floors = input.nextInt();
			
			ParkingLevel[] levels = new ParkingLevel[Floors];
			
			int numberedFloor = 1;
			while(numberedFloor <= Floors) {
				System.out.println("How many spaces are on floor " + numberedFloor + "? (Please, enter an int value.)");
				int spaces = input.nextInt();
				input.nextLine();
				
				System.out.println("How many spaces are for electric vehicles? If none, enter 0.");
				int electricSpaces = input.nextInt();
				input.nextLine();
				
				System.out.println("How many are for compact vehicles? If none, enter 0.");
				int compactSpaces = input.nextInt();
				input.nextLine();
				
				System.out.println("How many entraces does floor " + numberedFloor + "have?");
				int numEntrances = input.nextInt();
				input.nextLine();
				
				System.out.println("How many of these entrances can accomdodate buses?");
				int numBusEntrances = input.nextInt();
				input.nextLine();
				
				System.out.println("How many exits does floor " + numberedFloor + "have?");
				int numExits = input.nextInt();
				input.nextLine();
				
				System.out.println("How many exits can accomodate buses?");
				int numBusExits = input.nextInt();
				input.nextLine();
				
				//Make the parking level with the parameters provided
				ParkingLevel pl = new ParkingLevel(spaces, numExits, numEntrances, numberedFloor); 
				
				//Make Electric Spaces in the Parking Level
				for(int e = 0; e < electricSpaces; e++) { 
					pl.makeElectricSpace();
				}
				
				//Make Compact Spaces in the Parking Level
				for(int c = 0; c < compactSpaces; c++) {
					pl.makeCompactSpace();
				}
				
				//Make exits
				//Make bus exits
				
				
				//Make entrances
				//Make bus entrances 
				levels[numberedFloor-1] = pl;
				
				numberedFloor += 1;
			}
			
			
			
	}
}