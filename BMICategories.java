// Fred Luartes, 2/24/2016
// BMI Categories: This program computes for the user's BMI, then selects the appropriate category of the computed BMI. 

import java.util.Scanner;

public class BMICategories {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double height, weight, bmi;
		String bmiCategory;
		
		System.out.println("Your height in m: ");
		height = keyboard.nextDouble();
		
		System.out.println("Your weight in kg: ");
		weight = keyboard.nextDouble();
		
		bmi = weight / Math.pow(height, 2);
		bmiCategory = "";
		
		if (bmi < 15) {
			bmiCategory = "very severely underweight";
		}
		
		if (bmi >= 15 && bmi <= 16) {
			bmiCategory = "severely underweight";
		}
		
		if (bmi >= 16.1 && bmi <= 18.4) {
			bmiCategory = "underweight";
		}
		
		if (bmi >= 18.5 && bmi <= 24.9) {
			bmiCategory = "normal weight";
		}
		
		if (bmi >= 25 && bmi <= 29.9) {
			bmiCategory = "overweight";
		}
		
		if (bmi >= 30 && bmi <= 34.9) {
			bmiCategory = "moderately obese";
		}
		
		if (bmi >= 35 && bmi <= 39.9) {
			bmiCategory = "severely obese";
		}
		
		if (bmi > 40) {
			bmiCategory = "morbidly obese";
		}
		
		System.out.println("Your BMI is " + bmi);
		System.out.println("BMI Category : " + bmiCategory);
	}
}