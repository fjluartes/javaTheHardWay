// Fred Luartes, 3/11/2016
// Baby Nim: This program starts with three "piles", or 3 counters each. The user can choose piles, and remove the counters until all the piles are empty. 

import java.util.Scanner;

public class BabyNim
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int pile1, pile2, pile3, remove;
		String choice = "";
		pile1 = 3;
		pile2 = 3;
		pile3 = 3;
		
		do 
		{
			System.out.println("A: " + pile1 + "\tB: "  + pile2 + "\tC: " + pile3);
			System.out.println("\nChoose a pile: ");
			choice = keyboard.next();
			System.out.println("How many to remove from pile " + choice + ": ");
			remove = keyboard.nextInt();
				
			if (choice.equals("A") && remove <= pile1)
			{
				pile1 = pile1 - remove;
			}
			
			else if (choice.equals("B") && remove <= pile2)
			{
				pile2 = pile2 - remove;
			}
			
			else if (choice.equals("C") && remove <= pile3)
			{
				pile3 = pile3 - remove;
			}
			else 
			{
				System.out.println("That's not valid.");
			}
		} while (pile1 > 0 || pile2 > 0 || pile3 > 0);
		
		if (pile1 <= 0 && pile2 <= 0 && pile3 <= 0)
		{
			System.out.println("A: " + pile1 + "\tB: "  + pile2 + "\tC: " + pile3);
			System.out.println("All piles are empty. Good Job!");
		}
	}
}