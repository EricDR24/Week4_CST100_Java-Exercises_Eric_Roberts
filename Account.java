/** Program:  10.7 ATM Machine
  * File:     Account.java 
  * Summary:  Chapter 10, Excersise 7, create a ATM Machine using Account class
  * Author:   Eric Roberts
  * Date:     July 15, 2016
**/
import java.util.Date;

public class Account {
	
	//Data fields for Account
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	
	//constructors for Account
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}
	
	//setters
	public void setId(int newId) {
		id = newId;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	//getters
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public String getDateCreated() {
		return dateCreated.toString();
	}
	
	//methods for Account
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}

}
