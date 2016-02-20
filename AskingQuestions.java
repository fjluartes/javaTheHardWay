// Fred Luartes, 2/20/2016
// Asking Questions: This program uses java.util.Scanner for getting input from the user. 

import java.util.Scanner;

public class AskingQuestions 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String heightFeet, heightInches;
		double weight;
		
		System.out.println("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("How many feet are you? ");
		heightFeet = keyboard.next();
		
		System.out.println("How many inches? ");
		heightInches = keyboard.next();
		
		System.out.println("How much do you weigh? (in lbs)");
		weight = keyboard.nextDouble();
		
		System.out.println("So you're " + age + " years old, " + heightFeet + "'" + heightInches + "\" tall and " + weight + " lbs heavy.");
	}
}