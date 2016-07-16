/** Program:  10.2 BMI Class
  * File:     BMI.java 
  * Summary:  Chapter 10, Excersise 2, create a BMI Class
  * Author:   Eric Roberts
  * Date:     July 15, 2016
**/
public class BMI {
	
	//creating objects
	private String name;
	private int age;
	private double height;
	private double weight;
	
	//creating constants for BMI
	public static final int INCH_PER_FOOT = 12;
	public static final double METERS_PER_INCH = 0.0254;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	
	//creating BMI method
	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.height = weight;
		this.weight = height;
	}
	
	public BMI(String name, int age, double weight, double feet, double inches) {
		this(name, age, weight, feet + inches * 12);
	}
	
	
	public BMI(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	//getters for BMI
	public String getResults() {
		double bmi = getBMI();
		if (bmi < 18.5)
			return "Underweight";
		else if (bmi < 25)
			return "Normal";
		else if (bmi < 30)
			return "Overweight";
		else
			return "Obese";
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
		return Math.round(bmi * 100) / 100;
	}



	
}
