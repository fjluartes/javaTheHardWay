// Fred Luartes, 3/11/2016
// Baby Nim: This program starts with three "piles", or 3 counters each. The user can choose piles, and remove the counters until all the piles are empty. 

import java.util.Scanner;

public class BabyNim
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int A, B, C, remove;
		String choice = "";
		A = 3;
		B = 4;
		C = 5;
		
		System.out.println("A: " + A + "\tB: " + B + "\tC: " + C);
		
		do
		{
			System.out.println("\nChoose a pile: ");
			choice = keyboard.next();
			System.out.println("How many to remove from pile " + choice + ": ");
			remove = keyboard.nextInt();

			if (choice.equals("A") && remove <= A)
			{
				A = A - remove;
			}
			
			else if (choice.equals("B") && remove <= B)
			{
				B = B - remove;
			}
			
			else if (choice.equals("C") && remove <= C)
			{
				C = C - remove;
			}
			
			else if (A == 0 && B == 0 && C == 0)
			{
				break;
			}
			
			else 
			{
				System.out.println("That's not valid");
			}
			
			System.out.println("A: " + A + "\tB: " + B + "\tC: " + C);
		} while (A > 0 || B > 0 || C > 0);
		
		if (A <= 0 && B <= 0 && C <= 0)
		{
			System.out.println("\nAll piles are empty. Good Job!");
		}
	}
}