// Fred Luartes, 2/20/2016
// Dumb Calculator: This program adds three numbers and divide them by two. 

import java.util.Scanner;

public class DumbCalculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double num1, num2, num3, ans;
		
		System.out.println("What is your first number? ");
		num1 = keyboard.nextDouble();
		
		System.out.println("What is your second number? ");
		num2 = keyboard.nextDouble();
		
		System.out.println("What is your third number? ");
		num3 = keyboard.nextDouble();
		
		ans = (num1 + num2 + num3) / 2;
		
		System.out.println("(" + num1 + " + " + num2 + " + " + num3 + ") / 2 is... " + ans);
	}
}