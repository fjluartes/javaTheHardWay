// Fred Luartes. 2/29/2016
// Number Guessing with a Counter: This program asks the user to guess a number between 1 and 10, and lets the user guess until the answer is correct. The number of tries is displayed after the right guess. 

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingWithACounter {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int number = 1 + r.nextInt(10);
		int tries = 1; 
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.println("Your guess: ");
		int guess = keyboard.nextInt();
		
		while (guess != number) {
			System.out.println("That is incorrect. Guess again.");
			System.out.println("Your guess: ");
			guess = keyboard.nextInt();
			tries++;
		}
		 
		System.out.println("That's right! You're a good guesser.");
		System.out.println("It only took you " + tries + " tries.");
	}
}