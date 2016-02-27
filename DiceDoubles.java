// Fred Luartes, 2/28/2016
// Dice Doubles: This program simulates dice rolls until it rolls doubles (e.g. two 6's). 

import java.util.Random;

public class DiceDoubles {
	public static void main(String[] args) {
		Random r = new Random();
		int dice1, dice2, total;
		
		dice1 = 1 + r.nextInt(6);
		dice2 = 1 + r.nextInt(6);
		total = dice1 + dice2;
		
		System.out.println("HERE COMES THE DICE!");
		
		while (dice1 != dice2) {
			System.out.println("Roll #1: " + dice1);
			System.out.println("Roll #2: " + dice2);
			System.out.println("The total is " + total);
			
			dice1 = 1 + r.nextInt(6);
			dice2 = 1 + r.nextInt(6);
			total = dice1 + dice2;
		}
		
		System.out.println("Roll #1: " + dice1);
		System.out.println("Roll #1: " + dice1);
		System.out.println("The total is " + total);
	}
}