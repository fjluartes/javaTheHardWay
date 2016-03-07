// Fred Luartes, 3/7/2016
// Shorter Double Dice: This program simulates a 2-dice roll using do-while. 

import java.util.Random;

public class ShorterDoubleDice
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int dice1, dice2, total;
		
		System.out.println("HERE COMES THE DICE!");
		do
		{
			dice1 = 1 + r.nextInt(6);
			dice2 = 1 + r.nextInt(6);
			total = dice1 + dice2;
			
			System.out.println("Roll #1: " + dice1);
			System.out.println("Roll #2: " + dice2);
			System.out.println("The total is " + total + "!");
		} while (dice1 != dice2);
	}
}