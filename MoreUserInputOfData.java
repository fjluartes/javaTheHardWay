// Fred Luartes, 2/20/2016
// More user input of Java: This program asks for multiple user input with different types and display them with proper labels.

import java.util.Scanner;

public class MoreUserInputOfData
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String firstName, lastName, loginName; 
		int grade, studentID; 
		double GPA;
		
		System.out.println("Please enter the following information so I can sell it for a profit! \n");
		
		System.out.println("First Name: ");
		firstName = keyboard.next();
		
		System.out.println("Last Name: ");
		lastName = keyboard.next();
		
		System.out.println("Grade (9-12): ");
		grade = keyboard.nextInt();
		
		System.out.println("Student ID: ");
		studentID = keyboard.nextInt();
		
		System.out.println("Login: ");
		loginName = keyboard.next();
		
		System.out.println("GPA (0.0-4.0): ");
		GPA = keyboard.nextDouble();
		
		System.out.println("Your Information: ");
		System.out.println("\tLogin: \t" + loginName);
		System.out.println("\tID: \t" + studentID);
		System.out.println("\tName: \t" + lastName + ", " + firstName);
		System.out.println("\tGPA: \t" + GPA);
		System.out.println("\tGrade: \t" + grade);
	}
}