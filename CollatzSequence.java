// Fred Luartes, 3/10/2016
// Collatz Sequence: This program takes a number, then if it is even, it is divided by 2; if it is odd, it is multiplied by 3 then add 1; Then repeat the process until the number becomes 1. This is also known as Collatz Sequence. 

import java.util.Scanner;

public class CollatzSequence
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number, largest, counter;
		counter = 0;
		
		System.out.println("Starting number: ");
		number = keyboard.nextInt();
		largest = number;
		
		while (number != 1)
		{
			if (number % 2 == 0)
			{
				number = number / 2;
				if (number > largest)
				{
					largest = number;
				}
				
				System.out.println("\t" + number);
				counter++;
			}
		
			else if (number % 2 != 0)
			{
				number = (3 * number) + 1;
				if (number > largest)
				{
					largest = number;
				}
				
				System.out.println("\t" + number);
				counter++;
			} 
		}
		
		System.out.println("Terminated after " + counter + " steps.");
		System.out.println("The largest number was " + largest);
	}
}