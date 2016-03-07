// Fred Luartes, 3/7/2016
// Again with the Number Guessing: This program asks the user to guess a number from 1-10. The user guesses until he gets the correct answer. The program displays the number of tries.

import java.util.Random;
import java.util.Scanner;

public class AgainWithTheNumberGuessing
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int number = 1 + r.nextInt(10);
		int tries = 1;
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.println("Your guess: ");
		int guess = keyboard.nextInt();
		
		do
		{
			System.out.println("That is incorrect. Guess again.");
			System.out.println("Your guess: ");
			guess = keyboard.nextInt();
			tries++;
		} while (guess != number);
		
		System.out.println("That's right! You're a good guesser.");
		System.out.println("It only took you " + tries + " tries.");
	}
}