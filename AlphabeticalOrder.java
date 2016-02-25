// Fred Luartes, 2/25/2016
// Alphabetical Order: This program asks for the user's last name, and compares it with other last names to know its alphabetical order. 
// No curly braces used in one line if statements

import java.util.Scanner;
import java.lang.*;

public class AlphabeticalOrder {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String lastName, carswell, jones, smith, young; 
		int lastToDefault; 
		
		carswell = "Carswell";
		jones = "Jones";
		smith = "Smith";
		young = "Young";
		
		System.out.println("What is your last name? ");
		lastName = keyboard.next();
		
		if (carswell.compareTo(lastName) >= 0 && carswell.compareTo(lastName) < 3) 
			System.out.println("You don't have to wait long, " + lastName + ".");
			
		else if (jones.compareTo(lastName) >= 0 && jones.compareTo(lastName) <= 6) 
			System.out.println("That's not bad, " + lastName + ".");
			
		else if (smith.compareTo(lastName) >= 0 && smith.compareTo(lastName) <= 8) 
			System.out.println("Looks like a bit of a wait, " + lastName + ".");
			
		else if (young.compareTo(lastName) >= 0 && young.compareTo(lastName) <= 6) 
			System.out.println("It's gonna be a while, " + lastName + ".");
			
		else if (young.compareTo(lastName) < 0) 
			System.out.println("Not going anywhere for a while, " + lastName + "?");
	}
}