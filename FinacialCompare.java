/** Program:  10.22 String Class
  * File:     mainTax.java 
  * Summary:  Chapter 10, Excersise 22, create a Course Class
  * Author:   Eric Roberts
  * Date:     July 17, 2016
**/
import java.util.Scanner;

public class FinacialCompare {

	public static void main(String[] args) {
		//create Scanner
		Scanner sc = new Scanner(System.in);
		
		//prompt user to enter loan amount and number of years
		System.out.print("Loan Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYears = sc.nextInt();
		
		//header for table
		System.out.println(
				"Interest Rate    Monthly Payment    Total Payment");
			
			// print table with interest rates
			for (double i = 5.0; i <= 8; i += 0.125) {
				System.out.printf("%-5.3f", i);
				System.out.print("%           ");
				double monthlyInterestRate = i / 1200;
				double monthlyPayment = amount * monthlyInterestRate / (1
					- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
				System.out.printf("%-19.2f", monthlyPayment);
				System.out.printf("%-8.2f\n",(monthlyPayment * 12) * numberOfYears);
			}

	}

}
