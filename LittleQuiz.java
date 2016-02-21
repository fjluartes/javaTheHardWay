// Fred Luartes, 2/21/2016
// Little Quiz: This program asks the user three questions, displays if the user is correct or wrong in each question, and displays his total score. 

import java.util.Scanner;

public class LittleQuiz
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String quizAns;
		int multipleChoiceAns, score;
		
		score = 0;
		
		System.out.println("Are you ready for a quiz? ");
		quizAns = keyboard.next();
		
		System.out.println("Okay, here it comes! \n");
		
		System.out.println("What is the capital of Israel? ");
		System.out.println("\t1. Jerusalem");
		System.out.println("\t2. Tel Aviv");
		System.out.println("\t3. Nazareth");
		multipleChoiceAns = keyboard.nextInt();
		
		if (multipleChoiceAns == 1)
		{
			System.out.println("That's correct! Jerusalem is the only declared capital of Israel. \n");
			score += 1;
		}
		
		else 
		{
			System.out.println("Sorry, that's incorrect! \n");
		}
		
		System.out.println("Who is not a co-founder of Facebook? ");
		System.out.println("\t1. Dustin Moskovitz");
		System.out.println("\t2. Peter Thiel");
		System.out.println("\t3. Mark Zuckerberg ");
		multipleChoiceAns = keyboard.nextInt();
		
		if (multipleChoiceAns == 2)
		{
			System.out.println("That's correct! Peter Thiel is an angel investor that funded Facebook in 2004. \n");
			score += 1;
		}

		else 
		{
			System.out.println("Sorry, that's incorrect! \n");
		}
		
		System.out.println("When did Google had its IPO? ");
		System.out.println("\t1. 2006");
		System.out.println("\t2. 2001");
		System.out.println("\t3. 2004");
		multipleChoiceAns = keyboard.nextInt();
		
		if (multipleChoiceAns == 3)
		{
			System.out.println("That's correct! Google's IPO was held on August 19, 2004 at $85 a share. \n");
			score += 1;
		}
		
		else 
		{
			System.out.println("Sorry, that's incorrect! \n");
		}
		
		
		System.out.println("Overall, you got " + score + " out of 3 correct.");
		System.out.println("Thanks for playing! ");
	}
}