/** Program:  7.9 find the smallest element
  * File:     SmallestElement.java 
  * Summary:  Chapter 7, Exercise 9, find the smallest element
  * Author:   Eric Roberts
  * Date:     July 17, 2016
**/
import java.util.Scanner;

public class SmallestElement {
	
	public static void main(String[] args) {
		//create Scanner
		Scanner sc = new Scanner(System.in);
		double[] n = new double[10];
		
		//Prompt user to enter 10 numbers
		System.out.println("Enter ten numbers: ");
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextDouble();
		}
		
		//print smallest number
		System.out.println("The smallest number is: " + smallestNumber(n));
		
	}
	// method for smallest number
	public static double smallestNumber(double[] array) {
		double smallestNumber = array[0];
		for (int i = 0; i < array.length; i++) {
			if (smallestNumber > array[i])
				smallestNumber = array[i];
		}
		return smallestNumber;
		
	}
	

}
