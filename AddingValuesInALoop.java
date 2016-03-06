// Fred Luartes, 3/2/2016
// Adding Values in a Loop: This program asks the user for numbers, and adds the total of the numbers entered until the user enters a zero. 

import java.util.Scanner;

public class AddingValuesInALoop 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("I will add up the numbers you give me.");
		System.out.println("Number: ");
		int num = keyboard.nextInt();
		
		while (num != 0) 
		{
			sum = num + sum;
			System.out.println("The total so far is " + sum);
			System.out.println("Number: ");
			num = keyboard.nextInt();
		}
		System.out.println("The total is " + sum);
	}
}