// Fred Luartes, 2/21/2016
// How Old are You 2: This program displays exactly one message depending on age entered. 

import java.util.Scanner;

public class HowOldAreYou2 
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
		
		else if (age > 16 && age < 18) 
		{
			System.out.println("You can drive but you can't vote, " + name + ".");
		}
		
		else if (age > 18 && age < 24) 
		{
			System.out.println("You can vote but not rent a car, " + name + ".");
		}
		
		else 
		{
			System.out.println("You can do pretty much anything, " + name + ".");
		}
	}
}