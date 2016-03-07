// Fred Luartes, 3/7/2016
// Flip Again: This program simulates a coin flip by using a do-while loop.

import java.util.Scanner;
import java.util.Random;

public class FlipAgain 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		String again = "y";
		
		do
		{
			int flip = r.nextInt(2);
			String coin;
			
			if (flip == 1)
			{
				coin = "HEADS";
			}
			
			else 
			{
				coin = "TAILS";
			}
			
			System.out.println("You flip a coin and it is... " + coin);
			System.out.println("Would you like to flip again? (y/n)");
			again = keyboard.next();
		} while (again.equals("y"));
	}
}