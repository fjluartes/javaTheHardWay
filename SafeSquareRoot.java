// Fred Luartes, 3/8/2016
// Safe Square Root: This program gets the square root of a number typed in by the user. The program does not accept negative numbers. 

import java.util.Scanner;

public class SafeSquareRoot 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("SQUARE ROOT!");
		System.out.println("Enter a number: ");
		int num = keyboard.nextInt();
		
		while (num < 0)
		{
			System.out.println("You can't take the square root of a negative number, silly.");
			System.out.println("Try again: ");
			num = keyboard.nextInt();
		}
		
		double square = Math.sqrt(num);
		System.out.println("The square root of " + num + " is " + square);
	}
}