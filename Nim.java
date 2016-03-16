// Fred Luartes, 3/15/2016
// Nim: This program simulates a nim game.  

import java.util.Scanner;

public class Nim
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int A, B, C, remove;
		String name1, name2, name, choice;
		
		A = 3;
		B = 4;
		C = 5;
		choice = "";
		name = "";
		
		System.out.println("Player 1, enter your name: ");
		name1 = keyboard.next();
		System.out.println("Player 2, enter your name: ");
		name2 = keyboard.next();
		name = name1;
		System.out.println("A: " + A + "\tB: " + B + "\tC: " + C);
		
		do
		{
			while (name.equals(name1))
			{
				if (A != 0 || B != 0 || C != 0)
				{
					System.out.println("\n" + name + ", choose a pile: ");
					choice = keyboard.next();
					System.out.println("How many to remove from pile " + choice + ": ");
					remove = keyboard.nextInt();
					name = name2;

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
					
					else 
					{
						System.out.println("That's not valid");
					}
					
					System.out.println("A: " + A + "\tB: " + B + "\tC: " + C);
				}
				
				else 
				{
					break;
				}
			}
			
			while (name.equals(name2))
			{
				if (A != 0 || B != 0 || C != 0)
				{
					System.out.println("\n" + name + ", choose a pile: ");
					choice = keyboard.next();
					System.out.println("How many to remove from pile " + choice + ": ");
					remove = keyboard.nextInt();
					name = name1;

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
					
					else 
					{
						System.out.println("That's not valid");
					}
					
					System.out.println("A: " + A + "\tB: " + B + "\tC: " + C);
				}
				
				else
				{
					break;
				}
			}
		} while (A > 0 || B > 0 || C > 0);
		
		if (A <= 0 && B <= 0 && C <= 0)
		{
			System.out.println(name + ", there are no counters left, so you WIN!");
		}
	}
}