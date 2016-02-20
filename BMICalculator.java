// Fred Luartes, 2/20/2016
// BMI Calculator: This program computes for the user's BMI by inputting her height in feet, inches, and weight in pounds. 

import java.util.Scanner;

public class BMICalculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int heightFeet, heightInches, weight;
		double heightM, weightKG, bmi;
		
		System.out.println("Your height (feet only): ");
		heightFeet = keyboard.nextInt();
		
		System.out.println("Your height (inches): ");
		heightInches = keyboard.nextInt();
		
		System.out.println("Your weight in pounds: ");
		weight = keyboard.nextInt();
		
		heightM = (((heightFeet * 12) + heightInches) * 2.54) / 100;
		weightKG = weight / 2.2;
		bmi = weightKG / Math.pow(heightM, 2);
		
		System.out.println("Your BMI is " + bmi);
	}
}