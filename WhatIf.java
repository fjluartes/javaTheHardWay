// Fred Luartes, 2/21/2016
// What if: This program teaches the if statement. 
// Curly braces enclose the statement to be executed if the if condition is true. 

public class WhatIf 
{ 
	public static void main(String[] args)
	{
		int people = 20;
		int cats = 30;
		int dogs = 15;
		
		if (people < cats)
		{
			System.out.println("Too many cats! The world is doomed!"); // This message will be displayed if people are less than cats.
		}
		
		if (people > cats)
		{
			System.out.println("Not many cats! The world is saved!"); // This message will be displayed if people are greater than cats.
		}
		
		if (people < dogs)
		{
			System.out.println("The world is drooled on!"); // This message will be displayed if people are less than dogs.
		}
		
		if (people > dogs)
		{
			System.out.println("The world is dry!"); // This message will be displayed if people are greater than dogs.
		}
		
		dogs += 5;
		
		if (people >= dogs)
		{
			System.out.println("People are greater than or equal to dogs."); // This message will be displayed if people are greater than or equal to dogs.
		}
		
		if (people == dogs)
		{
			System.out.println("People are dogs."); // This message will be displayed if people are equal to dogs.
		}
	}
}