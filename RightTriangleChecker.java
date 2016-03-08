// Fred Luartes, 3/8/2016
// Right triangle checker: This program asks the user to enter three integers in ascending order, then checks if the integers are in ascending order and make the sides of a right triangle. 

import java.util.Scanner;

public class RightTriangleChecker
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int side1, side2, side3;
		
		System.out.println("Enter three integers: ");
		System.out.println("Side 1: ");
		side1 = keyboard.nextInt();
		System.out.println("Side 2: ");
		side2 = keyboard.nextInt();
		
		while (side2 < side1)
		{
			System.out.println(side2 + " is smaller than " + side1 + ". Try again.");
			System.out.println("Side 2: ");
			side2 = keyboard.nextInt();
		}
		
		System.out.println("Side 3: ");
		side3 = keyboard.nextInt();
		
		while (side3 < side2)
		{
			System.out.println(side3 + " is smaller than " + side2 + ". Try again.");
			System.out.println("Side 3: ");
			side3 = keyboard.nextInt();
		}
		
		if (Math.pow(side3, 2) == Math.pow(side1, 2) + Math.pow(side2, 2))
		{
			System.out.println("\nYour three sides are " + side1 + ", " + side2 + ", " + side3);
			System.out.println("These sides do make a right triangle. Yippee!");
		}
		else 
		{
			System.out.println("\nYour three sides are " + side1 + ", " + side2 + ", " + side3);
			System.out.println("These sides do not make a right triangle!");
		}
	}
}
