// Fred Luartes, 3/17/2016
// Counting Machine: This program asks the user for a number, then the program counts until the entered number.

import java.util.Scanner;

public class CountingMachine
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Count to: ");
		int count = keyboard.nextInt();
		
		for(int n = 1; n <= count; n++) 
		{
			System.out.println(n);
		}
	}
}