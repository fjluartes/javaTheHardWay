// Fred Luartes, 2/25/2016
// Worst number-guessing game: This program asks the user to guess a number from 1-10, then tells it if the guess is right or wrong. 

import java.util.Scanner;

public class WorstGuessing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("TEH WORST NUBMER GESSING GAEM EVAR!!!!\n");
		
		System.out.println("I'M THKING OF A NMBR FROM 1-10. TRY 2 GESS! ");
		int number = keyboard.nextInt();
		
		if (number == 3) 
			System.out.println("LOL!!! U GOT IT! I CANT BELEIVE U GESSD IT WAS 3! \n");
		
		else 
			System.out.println("WOOT! U SUX!!! I PWN YOO!! IT WAS 3! \n");	
	}
}