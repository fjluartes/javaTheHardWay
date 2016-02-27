// Fred Luartes, 2/28/2016
// Keep Guessing: This program asks the user to guess a number from 1 to 10, then keeps guessing until the user gets the correct answer. 

import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int guess, number;
		number = 1 + r.nextInt(10);
		
		System.out.println("I have chosen a number between 1 and 10. try to guess it.");
		System.out.println("Your guess: ");
		guess = keyboard.nextInt();
		
		while (guess != number) {
			System.out.println("That is incorrect. Guess again.");
			System.out.println("Your guess: ");
			guess = keyboard.nextInt();
		}
		
		System.out.println("That's right! You're a good guesser.");
	}
}