// Fred Luartes, 2/23/2016
// Twenty Questions: This program teaches how to use nested if statements. The user is asked a question, and another question based on the first answer. 
// learned to compare strings using var1.equals(var2)
// open curly brace typed in the same line as class, main function, and if statements (like C)

import java.util.Scanner;

public class TwentyQuestions {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String object, bigger, objectAns1, objectAns2, objectAns3, biggerAns1, biggerAns2; 
		
		objectAns1 = "animal";
		objectAns2 = "vegetable";
		objectAns3 = "mineral";
		
		biggerAns1 = "yes";
		biggerAns2 = "no";
		
		System.out.println("TWO QUESTIONS! ");
		System.out.println("Think of an object, and I'll try to guess it. \n");
		
		System.out.println("Question 1. Is it an animal, vegetable or mineral? ");
		object = keyboard.next();
		
		if (object.equals(objectAns1)) {
			System.out.println("Question 2. Is it bigger than a breadbox? ");
			bigger = keyboard.next();
		
			if (bigger.equals(biggerAns2)) {
				System.out.println("My guess is you are thinking of hamster. ");
				System.out.println("I would ask you if I'm right but I don't actually care. ");
			}
			
			else if (bigger.equals(biggerAns1)) {
				System.out.println("My guess is you are thinking of elephant. ");
				System.out.println("I would ask you if I'm right but I don't actually care. ");
			}
		}
		
		if (object.equals(objectAns2)) {
			System.out.println("Question 2. Is it bigger than a breadbox? ");
			bigger = keyboard.next();
			
			if (bigger.equals(biggerAns2)){		
				System.out.println("My guess is you are thinking of broccoli. ");
				System.out.println("I would ask you if I'm right but I don't actually care. ");
			}
			
			else if (bigger.equals(biggerAns1)) {
				System.out.println("My guess is you are thinking of watermelon. ");
				System.out.println("I would ask you if I'm right but I don't actually care. ");
			}
		}
		
		if (object.equals(objectAns3)) {
			System.out.println("Question 2. Is it bigger than a breadbox? ");
			bigger = keyboard.next();
			
			if (bigger.equals(biggerAns2)) {
				System.out.println("My guess is you are thinking of pen. ");
				System.out.println("I would ask you if I'm right but I don't actually care. ");
			}
			
			else if (bigger.equals(biggerAns1)) {
				System.out.println("My guess is you are thinking of Ferrari. ");
				System.out.println("I would ask you if I'm right but I don't actually care. ");
			}
		}
	}
}