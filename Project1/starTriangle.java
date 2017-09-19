// Jacob Jaminet
// 19 Sept 2017
// IST-JAV
// INSA-Lyon
// This program prints out lines of * to make a triangle in the output screen using for loops and if conditionals. 

public class starTriangle {

	public static void starTriangle() {
		String starTriangle = "";
		for (int i = 0; i <= 5; i++){
			starTriangle = starTriangle + "*";
			System.out.println(starTriangle);
			if (i == 5){
				int index = starTriangle.length();
				for(int j = 4; j >= 1; j--){
					index = index - 1;
					System.out.println(starTriangle.substring(0, index));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		starTriangle();
	}

}
