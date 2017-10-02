/**
 * This is the program that runs all of the others one
 */

/**
 * @author jamin
 *
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Plaza mallParking = new Plaza();
		HandicapCar MrJenkinsJalloppy = new HandicapCar();
		ElectricCar Tesla = new ElectricCar();
		Plaza.parkCar(Tesla);
		Plaza.parkCar(MrJenkinsJalloppy);
		Plaza.getCar(1);
		Plaza.isFull();
	}

}
