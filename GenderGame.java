// Fred Luartes, 2/24/2016
// Gender Game: This program asks the user's gender, first and last names, and age. Different messages are displayed depending on the user's gender and age. 
// If there is only one statement inside the if or else statement, the curly braces can be omitted. 

import java.util.Scanner;

public class GenderGame {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String gender, genderM, genderF, firstName, lastName, titleName, yesOrNo, yes, no;
		int age;
		
		genderM = "M";
		genderF = "F";
		yes = "y";
		no = "n";
		titleName = "";
		
		System.out.println("What is your gender? (M or F)");
		gender = keyboard.next();
		
		System.out.println("First Name: ");
		firstName = keyboard.next();
		
		System.out.println("Last Name: ");
		lastName = keyboard.next();
		
		System.out.println("Age: ");
		age = keyboard.nextInt();
		
		if (genderF.equals(gender) && age >= 20) {
			System.out.println("Are you married, " + firstName + " (y or n)? ");
			yesOrNo = keyboard.next();
			
			if (yes.equals(yesOrNo)) 
				titleName = "Mrs. " + lastName; 
			
			else if (no.equals(yesOrNo)) 
				titleName = "Ms. " + lastName;
		}
		
		else if (genderM.equals(gender) && age >= 20) 
			titleName = "Mr. " + lastName;
		
		else 
			titleName = firstName + " " + lastName; 
		
		System.out.println("Then I shall call you " + titleName + ".");
	}
}