// Fred Luartes, 2/29/2016
// Pin Lockout: This program asks the user for a pin, then confirms if the pin is correct. The user has 3 tries before the account is locked. 

import java.util.Scanner;

public class PinLockout {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		int tries = 0;
		int max = 4;
		
		System.out.println("WELCOME TO THE BANK OF PILIPINAS!");
		System.out.println("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();
		tries++;
		
		while (entry != pin && tries < max) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.println("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
			tries++;
		}
		
		if (entry == pin) 
			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
		else if (tries >= max)
			System.out.println("\nYOU HAVE REACHED THE MAXIMUM NUMBER OF FAILED PIN ATTEMPTS. ACCOUNT LOCKED.");
	}
}