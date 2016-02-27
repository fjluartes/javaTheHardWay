// Fred Luartes, 2/26/2016
// Number-guessing game: This program asks the user to guess the number the program is randomizing, then checks if the user's guess is correct. 

import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int guess, number;
		
		number = 1 + r.nextInt(10);
		
		System.out.println("I'm thinking of a number from 1 to 10. ");
		System.out.println("Your guess: ");
		guess = keyboard.nextInt();
		
		if (guess == number)
			System.out.println("That's right! My secret number was " + number + "!");
		
		else
			System.out.println("Sorry, but I was really thinking of " + number + ".");
	}
}