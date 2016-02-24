// Fred Luartes, 2/23/2016 
// Two more Questions: This program asks the user two questions. The program is created with if statements, and no else if, else, and nested if statements. 

import java.util.Scanner;

public class TwoMoreQuestions {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String insideOutsideBoth, inside, outside, both, 
		livingOrNot, living, notLiving;
		
		inside = "inside";
		outside = "outside";
		both = "both";
		
		living = "yes";
		notLiving = "no";
		
		System.out.println("TWO MORE QUESTIONS, BABY!\n");
		
		System.out.println("Think of something, and I'll try to guess it!\n");
		
		System.out.println("Question 1. Does it stay inside, outside, or both? ");
		insideOutsideBoth = keyboard.next();
		
		System.out.println("Question 2. Is it a living thing? (yes or no)");
		livingOrNot = keyboard.next();
		
		if (inside.equals(insideOutsideBoth) && living.equals(livingOrNot)) {
			System.out.println("You're thinking about a flower. ");
		}
		
		if (outside.equals(insideOutsideBoth) && living.equals(livingOrNot)) {
			System.out.println("You're thinking about a lion, right? ");
		}
		
		if (both.equals(insideOutsideBoth) && living.equals(livingOrNot)) {
			System.out.println("You're thinking about your cat, aren't you? ");
		}
		
		if (inside.equals(insideOutsideBoth) && notLiving.equals(livingOrNot)) {
			System.out.println("You're thinking about your TV. ");
		}
		
		if (outside.equals(insideOutsideBoth) && notLiving.equals(livingOrNot)) {
			System.out.println("You're thinking about a telephone pole. ");
		}
		
		if (both.equals(insideOutsideBoth) && notLiving.equals(livingOrNot)) {
			System.out.println("You're thinking about clothes. ");
		}	
	}
}