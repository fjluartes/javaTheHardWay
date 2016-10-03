// Fred Luartes, 3/23/2016
// Adding Values in a For Loop: This program asks the user for an integer, add up all the numbers from 1 to the integer, then displays the total.

import java.util.Scanner;

public class AddingValuesForLoop {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number, sum;
		
		System.out.println("Number: ");
		number = keyboard.nextInt();
		sum = 0;
		
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("The sum is " + sum);
	}
}