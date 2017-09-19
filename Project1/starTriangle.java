/***
 * 
 * @author Jacob Jaminet
 * 19 Sept 2017
 * IST-JAV
 * INSA-Lyon
 * This program takes in command line arguments, n, and prints a (2N + 1)-by-(2N + 1) triangle
 * 
 */


public class starTriangle {

	public static void starTriangle(int n) { 							//n is N in the (2N+1)
		String starTriangle = ""; 										//declare an empty string to work with inside the loop
		for (int i = 0; i < n; i++){									//going to print as many rows as specified
			starTriangle = starTriangle + "**"; 						//add two * for the first line	
			
			if (starTriangle.length() == (2*n)){ 						//once the row has reached this length it is time to start going down 
				System.out.println(starTriangle); 						//this last row still has to be printed
				System.out.println(starTriangle+"*"); 					//this is where the row of length (2N+1) is printed
				int index = starTriangle.length(); 						//we can't 'subtract' from a string variable like we 'added' before, but we can use the substring function to print less and less of the string
				
				for(int j = n; j >= 1; j--){ 							//this is where we start going down, now using n as our starting value
					System.out.println(starTriangle); 					//repeated value of the starTriangle variable
					index = index - 2;									//move the 'reading frame' down from the right
					starTriangle = starTriangle.substring(0, index); 	//using the index, we can print less and less of the variable and 'subtract' away from it
				}
			}else{
				System.out.println(starTriangle);						//this printed out the top half of our triangle	
			}
		}
	}
	
	public static void main(String[] args) { 							//in Java, command-line arguments are passed in as an array and can be referenced as such
		for(int g = 0; g < args.length;g++) 							//for as many command-line arguments as we have...
			starTriangle(Integer.parseInt(args[g])); 					//the arguments are passed from the command line as an array of objects. 
	}

}
