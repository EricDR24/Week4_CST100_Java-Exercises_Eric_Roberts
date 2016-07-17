/** Program:  10.22 String Class
  * File:     mainTax.java 
  * Summary:  Chapter 10, Excersise 22, create a Course Class
  * Author:   Eric Roberts
  * Date:     July 17, 2016
**/
public class MainMyString1 {

	public static void main(String[] args) {
		
		//Create Char arrays
		char[] char1 = {'E', 'R', 'I', 'C'};
		char[] char2 = {'R', 'O', 'B', 'E', 'R', 'T', 'S'};
		
		//create objects
		MyString1 str = new MyString1(char1);
		MyString1 str1 = new MyString1(char2);
		
		//print character at position 1 of MyString1
		System.out.println("Character at position 1 of MyString1: " + str.charAt(1));
		
		//print the length
		System.out.println("The length of MyString1 of object str is: " + str.length());
		
		//print substring from position 2 to 4
		System.out.println("Substring from index 2 to 4 of MyString1 object str: ");
		MyString1 substr = str.substring(2, 4);
		for (int i = 0; i < substr.length(); i++) {
			System.out.print(substr.charAt(i));		
		}
		System.out.println();
		
		//print in lower case
		System.out.println("\nMyString1 object 1 to lowercase:");
		MyString1 lower = str.toLowerCase();
		for (int i = 0; i < lower.length(); i++) {
			System.out.print(lower.charAt(i));		
		}
		System.out.println();
		
		//test to see if strings are the same
		System.out.println("MyString1 str 1 is equal to MyString1 str 2? " 
				+ str.equals(str1));

		
		//print integer 10
		System.out.println("Display the integer 10 as a MyString1 object: ");
		MyString1 value = str.valueOf(10);
		for (int i = 0; i < value.length(); i++) {
			System.out.print(value.charAt(i));		
		}
		System.out.println();
	
}	

}
