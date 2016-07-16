/** Program:  10.2 BMI Class
  * File:     BMI.java 
  * Summary:  Chapter 10, Excersise 2, create a BMI Class
  * Author:   Eric Roberts
  * Date:     July 15, 2016
**/
public class mainBMI {

	public static void main(String[] args) {
		// Print Results of BMI
		BMI bmi1 = new BMI("Kim Yang", 18, 145, 5, 10);
		System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getResults());
		
		BMI bmi2 = new BMI("Susan King", 215, 70);
		System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getResults());
		

	}

}
