// Fred Luartes, 2/29/2016
// Counting with a While Loop: This program counts using a while loop. 

import java.util.Scanner;

public class CountingWhile {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n, count;
		n = 0;
		
		System.out.println("Type in a message, and I'll display it five times.");
		System.out.println("Message: ");
		String message = keyboard.nextLine();
		
		System.out.println("How many times: ");
		count = keyboard.nextInt();
		
		while (n < (count * 10)) {
			System.out.println((n + 10) + ". " + message);
			n += 10;
		}
	}
}