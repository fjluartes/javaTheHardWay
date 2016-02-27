// Fred Luartes, 2/26/2016
// Three Card Monte: This program asks the user where the Ace card is from a three-card pile. The program displays if the user is correct or not. This is like the "ball and cups" game.

import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int card, guess;
		
		card = 1 + r.nextInt(3);
		
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
		System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
		System.out.println("He lays down three cards.\n");
		
		System.out.println("Which one is the ace?");
		System.out.println("");
		System.out.println("\t##\t##\t##");
		System.out.println("\t##\t##\t##");
		System.out.println("\t##\t##\t##");
		System.out.println("\t1 \t2 \t3 ");
		System.out.println("");
		
		guess = keyboard.nextInt();
		
		if (card == 1){
			if (guess == card) {
				System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
				System.out.println("");
				System.out.println("\tAA\t##\t##");
				System.out.println("\tAA\t##\t##");
				System.out.println("\tAA\t##\t##");
				System.out.println("\t1 \t2 \t3 ");
				System.out.println("");
			}
			
			else {
				System.out.println("Ha! Fast Eddie wins again! The ace was card number 1.");
				System.out.println("");
				System.out.println("\tAA\t##\t##");
				System.out.println("\tAA\t##\t##");
				System.out.println("\tAA\t##\t##");
				System.out.println("\t1 \t2 \t3 ");
				System.out.println("");
			}
		}
		
		else if (card == 2){
			if (guess == card) {
				System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
				System.out.println("");
				System.out.println("\t##\tAA\t##");
				System.out.println("\t##\tAA\t##");
				System.out.println("\t##\tAA\t##");
				System.out.println("\t1 \t2 \t3 ");
				System.out.println("");
			}
			
			else {
				System.out.println("Ha! Fast Eddie wins again! The ace was card number 2.");
				System.out.println("");
				System.out.println("\t##\tAA\t##");
				System.out.println("\t##\tAA\t##");
				System.out.println("\t##\tAA\t##");
				System.out.println("\t1 \t2 \t3 ");
				System.out.println("");
			}
		}
		
		else if (card == 3){
			if (guess == card) {
				System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
				System.out.println("");
				System.out.println("\t##\t##\tAA");
				System.out.println("\t##\t##\tAA");
				System.out.println("\t##\t##\tAA");
				System.out.println("\t1 \t2 \t3 ");
				System.out.println("");
			}
			
			else {
				System.out.println("Ha! Fast Eddie wins again! The ace was card number 3.");
				System.out.println("");
				System.out.println("\t##\t##\tAA");
				System.out.println("\t##\t##\tAA");
				System.out.println("\t##\t##\tAA");
				System.out.println("\t1 \t2 \t3 ");
				System.out.println("");
			}
		}
	}
}