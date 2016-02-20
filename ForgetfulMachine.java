// Fred Luartes, 2/20/2016
// Forgetful Machine: This program uses java.util.Scanner for getting input from the user without storing the inputted value. 

import java.util.Scanner;

public class ForgetfulMachine 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give me a word! ");
		keyboard.next();
		
		System.out.println("Give me a second word! ");
		keyboard.next();
		
		System.out.println("Great, now your favorite number? ");
		keyboard.next();
		
		System.out.println("And your next favorite number... ");
		keyboard.next();
		
		System.out.println("Whew! Wasn't that fun?");
	}
}