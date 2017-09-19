/***
 * 
 * @author Jacob Jaminet
 * 19 Sept 2017
 * IST-JAV
 * INSA-Lyon
 * This program sorts a random 15-integer array into an ordered array in descending order.
 * This program is then tested with the main method by creating a pre-specified int array.
 * It is then tested with an array filled with random integers using the Random library.
 * 
 * The idea behind the code is there are two pairs of eyes on the values.
 * The reference pointer marks where the largest value should be, then moves and fills in with the next largest value.
 * The looker pointer is used to see if any value right of the reference is greater than what is currently stored at the reference location.
 * Once looker has reached the end of the array, reference moves one space down and the process is repeated.
 *  
 */
import java.util.Random; 		//import this library so I can implement a random number machine later on

public class Sort {

	public static int[] sortArray(int[] array){ 						//takes in an int array and returns an int array
		int holdThis;													//creates a place in memory to help move numbers around in the array
		for(int reference = 0; reference < array.length; reference++){	//The outer for loop controls the reference location. It will only go through the array once, filling in the values with the largest value, second largest value, and so on.
			for(int looker = 0; looker < array.length;looker++){		//Looker does all the running through the array like a basketball player running suicides up and down the court, looking for values that are bigger than what is currently at reference's location
				if(array[looker] < array[reference]) { 					//When I first did this, I thought that looker should be bigger than reference but the code was doing the opposite of what I wanted i.e. sorting in ascending order. I swapped it and it started doing what I wanted so I'm content.
					holdThis = array[reference]; 						//Can't overwrite two values at the same time so we put on value aside while we write over the original and will use this later
					array[reference] = array[looker];					//now the value at reference is the value at looker
					array[looker] = holdThis;							//looker is now the value of holdThis which was the value that was at reference
				}
			}
		}
	return array;
	}
	
	
	public static void main(String[] args) {
		//KNOWN ARRAY TEST
		int[] testArr = {1, 2, 3, 8, 5, 6, 7, 5, 9, 10, 11, 12, 89, 14, -9}; 	//implement a known test array
		System.out.println("This is my test array!");
		for(int i = 0; i < testArr.length; i++)
			System.out.println(testArr[i]);		
		
		//sorting my test array
		int[] sortedArr = sortArray(testArr);
		
		//seeing if it worked
		System.out.println("This is testArr after sorting: ");
		for(int i = 0; i < sortedArr.length; i++)
			System.out.println(testArr[i]);
		
		//RANDOM ARRAY TEST
		Random rand = new Random(); 	//random number machine
		//creating an array of random values
		int[] ranArr = new int[15]; 											//create an empty int array of length 15
		for(int i = 0; i < ranArr.length;i++){									//filling that array with random numbers
			ranArr[i] = rand.nextInt(Integer.MAX_VALUE) + Integer.MIN_VALUE;  	//creates a random int between the maximum possible value of integers and the lowest possible value.
		}
		
		System.out.println("This is my random array of integers.");
		for(int i = 0; i < ranArr.length; i++)
			System.out.println(ranArr[i]);		
		
		//Sorting the array
		ranArr = sortArray(ranArr);
		
		//Seeing if it worked
		System.out.println("This is my random array of integers now sorted.");
		for(int i = 0; i < ranArr.length; i++)
			System.out.println(ranArr[i]);				
	}
}
