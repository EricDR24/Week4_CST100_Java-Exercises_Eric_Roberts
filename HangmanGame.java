/** Program:  7.35 HangmanGame
  * File:     HangmanGame.java 
  * Summary:  Chapter 7, Exercise 35, create a hangman game
  * Author:   Eric Roberts
  * Date:     July 17, 2016
**/
import java.util.Scanner;

public class HangmanGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String play;
		do {
			// generate a random word 
			char[] word = getWord();
			
			// print each letter in the word as an asterisk.
			char[] asterisks = new char[word.length];
			fillAsterisks(asterisks);

			int wrong = 0; // number of wrong guesses
			do {
				// prompt the user to guess one letter
				char guess = getGuess(asterisks);		
				
				// check if is letter is correct
				if (!isCorrectGuess(word, asterisks, guess))
					wrong++;
					
			} while (!isWordFinish(asterisks));
			
			// print results
			print(word, wrong);
			
			//prompt play to play with another word
			System.out.println("Do you want to guess another word? Enter y or n>");
			play = sc.next();

		} while (play.charAt(0) == 'y');
	}

	//generate a word from a list
	public static char[] getWord() {
		String[] words = {"write", "that", "may", "june", "july", "august", "september", "october", "november", "december", "january", "febuary", "march", "april"};

		String pick = words[(int)(Math.random() * words.length)];
		char[] word = new char[pick.length()];

		for (int i = 0; i < word.length; i++) {
			word[i] = pick.charAt(i);
		}
		return word;
	}

	//fillAsterisks initializes a list with asterisks
	public static void fillAsterisks(char[] list) {
		for (int i = 0; i < list.length; i++) {
			list[i] = '*';
		}
	}

	//checkGuess tests if the users guess was correct
	public static boolean isCorrectGuess(char[] word, char[] blanks, char guess) {
		boolean correct = false;
		int message = 2;
		for (int i = 0; i < word.length; i++) {
			if (word[i] == guess) {
				correct = true;
				if (blanks[i] == guess)
					message = 1;
				else { 
					blanks[i] = guess;
					message = 0;
				}
			}
		}
		if (message > 0)
			print(message, guess);
		return correct;
	}

	//boolean to check if word is finished
	public static boolean isWordFinish(char[] blanks) {
		for (char e: blanks) {
			if (e == '*')
				return false;
		}
		return true;
	}

	//print overloaded
	public static void print(char[] word, int missed) {
		System.out.print("The word is ");
		System.out.print(word);
		System.out.println(" You missed " + missed + " time");
	}


	public static void print(int m, char guess) {
		System.out.print("\t" + guess);
		switch (m) {
			case 1 : System.out.println(" is already in the word"); break;
			case 2 : System.out.println(" is not in the word");
		}
	}

	//prompts the user to guess one letter at a time
	public static char getGuess(char[] asterisks){
		Scanner sc = new Scanner(System.in);
		System.out.print("(Guess) Enter a letter in word ");
		System.out.print(asterisks);
		System.out.print(" > ");
		String g = sc.next();
		return g.charAt(0);
	}
}