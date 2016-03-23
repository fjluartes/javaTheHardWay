// Fred Luartes, 3/23/2016
// Baby Blackjack: This program gives the player two numbers from 1-10, then gives the dealer two random numbers from 1-10. Then compares the total of each pair. The greater total wins. 

import java.util.Random;

public class BabyBlackjack
{
	public static void main(String[] args)
	{		
		int card1, card2, card3, card4, total1, total2;
		Random r = new Random();
		
		card1 = 1 + r.nextInt(10);
		card2 = 1 + r.nextInt(10);
		card3 = 1 + r.nextInt(10);
		card4 = 1 + r.nextInt(10);
		total1 = card1 + card2;
		total2 = card3 + card4;
		
		System.out.println("Baby Blackjack!");
		System.out.println("You drew " + card1 + " and " + card2 + ".");
		System.out.println("Your total is " + total1 + ".\n");
		System.out.println("The dealer has " + card3 + " and " + card4 + ".");
		System.out.println("Dealer's total is " + total2 + ".\n");
		
		if (total1 > total2)
		{
			System.out.println("YOU WIN!");
		}
		else if (total1 < total2)
		{
			System.out.println("YOU LOSE!");
		}
		else
		{
			System.out.println("DRAW!");
		}
	}
}