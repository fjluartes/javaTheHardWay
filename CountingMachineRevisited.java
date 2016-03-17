// Fred Luartes, 3/17/2016
// Counting Machine Revisited: This program asks the user for a number count from, count to, and count by interval.

import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Count from: ");
		int countFrom = keyboard.nextInt();
		
		System.out.println("Count to: ");
		int countTo = keyboard.nextInt();
		
		System.out.println("Count by: ");
		int countBy = keyboard.nextInt();
		
		for(int n = countFrom; n <= countTo; n = n + countBy) 
		{
			System.out.println(n);
		}
	}
}