// Fred Luartes, 2/20/2016
// Name, Age, and Salary: This program uses java.util.Scanner for user input and displays the input in the next line. 

import java.util.Scanner;

public class NameAgeAndSalary 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		double salary;
		
		System.out.println("Hello! What is your name? ");
		name = keyboard.next();
		
		System.out.println("Hi " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println("So you're " + age + " eh? That's not old at all!");
		
		System.out.println("How much do you make, " + name + "?");
		salary = keyboard.nextDouble();
		
		System.out.println(salary + "! I hope that's per hour and not per year! LOL");
	}
}