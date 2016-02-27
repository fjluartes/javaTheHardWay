// Fred Luartes, 2/26/2016
// Enter your PIN: This program asks the user for a 5-digit pin, then uses the while loop to check if the pin is correct. 

import java.util.Scanner;

public class EnterPIN {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		
		System.out.println("WELCOME TO THE BANK OF PILIPINAS!");
		System.out.println("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		
		while (entry != pin) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.println("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		
		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}