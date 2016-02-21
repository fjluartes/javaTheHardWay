// Fred Luartes, 2/21/2016
// How Old are You?: This program displays different messages depending on your age. 

import java.util.Scanner;

public class HowOldAreYou 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("Hey, what's your name? ");
		name = keyboard.next();
		
		System.out.println("Ok, " + name + ", how old are you? "); 
		age = keyboard.nextInt();
		
		if (age < 16) 
		{
			System.out.println("You can't drive, " + name + ".");
		}
		
		if (age < 18) 
		{
			System.out.println("You can't vote, " + name + ".");
		}
		
		if (age > 18) 
		{
			System.out.println("You can vote, " + name + ".");
		}
		
		if (age < 25) 
		{
			System.out.println("You can't rent a car, " + name + ".");
		}
		
		if (age > 25) 
		{
			System.out.println("You can rent a car, " + name + ".");
		}
	}
}