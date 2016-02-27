// Fred Luartes, 2/26/2016
// Dice: This program simulates two dice rolls by picking a random number from 1-6, then adds the result of the two rolls. 

import java.util.Random;

public class Dice {
	public static void main(String[] args) {
		Random r = new Random();
		int dice1, dice2, sum;
		
		dice1 = 1 + r.nextInt(6);
		dice2 = 1 + r.nextInt(6);
		sum = dice1 + dice2;
		
		System.out.println("HERE COMES THE DICE! \n");
		System.out.println("Roll #1: " + dice1);
		System.out.println("Roll #2: " + dice2);
		System.out.println("The total is " + sum + "!");
	}
}