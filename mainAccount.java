/** Program:  10.7 ATM Machine
  * File:     mainAccount.java 
  * Summary:  Chapter 10, Excersise 7, create a ATM Machine using Account class
  * Author:   Eric Roberts
  * Date:     July 15, 2016
**/
import java.util.Scanner;

public class mainAccount {

	public static void main(String[] args) {
		//Create Scanner for ATM Machine
		Scanner sc = new Scanner(System.in);
		
		//an array that creates 10 accounts
		Account[] accounts = new Account[10];
		
		intBalance(accounts);
		
		//prompt id
		do {
			System.out.println("Enter an id: ");
			int id = sc.nextInt();
			
			if (isValid(id, accounts)) {
				int choice;
				do {
					choice = menu(sc);
					if (isTrans(choice)) {
						executeTrans(choice, accounts, id, sc);
					}
				} while (choice != 4);
			}
		} while (true);
	}
	//display menu
	private static int menu(Scanner sc) {
		System.out.println("\nMain menu\n1: withdraw\n2: deposite\n3: check balance\n4: exit\nEnter number: ");
		return sc.nextInt();
	}
	
	//display transaction
	public static void executeTrans(int choice, Account[] accounts, int id,
			Scanner sc) {
		    switch(choice) {
		    case 1: System.out.println("Enter amount to withdraw: ");
		    accounts[id].withdraw(sc.nextDouble());
		    break;
		    case 2: System.out.println("Enter amount to deposit: ");
		    accounts[id].deposit(sc.nextDouble());
		    break;
		    case 3: System.out.println("The balance is " + accounts[id].getBalance());
		    }
		
	}


	//choice of transaction
	private static boolean isTrans(int choice) {
		return choice > 0 && choice < 4;
	}
	//check to see if id valid
	public static boolean isValid(int id, Account[] accounts) {
		for (int i = 0; i < accounts.length; i++) {
			if (id == accounts[i].getId())
				return true;
		}
		return false;
	}
	//start accounts with balance 100
	public static void intBalance(Account[] accounts) {
		int intBalance = 100;
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = new Account(i, intBalance);
		}
	}
	
	

}
