// Fred Luartes, 2/26/2016
// One Shot Hi-Lo: This program asks the user to guess a number from 1-100, then tells her that her guess is high or low, and if the guess is correct. 

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {
	public static void main(String[] args) { 
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int number, guess;
	
		number = 1 + r.nextInt(100);
	
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		guess = keyboard.nextInt();
	
		if (guess > number) 
			System.out.println("Sorry, you are too high. I was thinking of " + number);
	
		else if (guess < number)
			System.out.println("Sorry, you are too low. I was thinking of " + number);
	
		else if (guess == number)
			System.out.println("You guessed it! What are the odds?!?");
	}
}