// Fred Luartes, 2/23/2016
// Age Messages 3: This program is similar to How old are you, but uses if and else if statements. 

import java.util.Scanner;

public class AgeMessages3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age; 
		
		System.out.println("Your name: ");
		name = keyboard.next();
		
		System.out.println("Your age: ");
		age = keyboard.nextInt();
		
		if (age < 16) {
			System.out.println("You can't drive, " + name + ".");
		}
		
		else if (age > 16 && age < 18) {
			System.out.println("You can drive, but you can't vote, " + name + ".");
		}
		
		else if (age > 18 && age < 24) {
			System.out.println("You can vote, but you can't rent a car, " + name + ".");
		}
		
		else {
			System.out.println("You can do pretty much everything, " + name + ".");
		}
	}
}