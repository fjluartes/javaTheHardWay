// Fred Luartes, 2/21/2016
// Else and If: This program teaches how to use else and if statements. 
// else if and else gives certain results if the if statement is false. 
// removing the else in else if changes the grouping of the if statements. It would display the else statements after the first if statements. 

public class ElseAndIf 
{
	public static void main(String[] args)
	{
		int people = 30;
		int cars = 40;
		int buses = 15; 
		
		if (cars > people)
		{
			System.out.println("We should take cars.");
		}
		
		else if (cars < people)	
		{
			System.out.println("We should not take cars.");
		}
		
		else 
		{
			System.out.println("We can't decide.");
		}
		
		if (buses > cars)
		{
			System.out.println("That's too many buses.");
		}
		
		else if (buses < cars)	
		{
			System.out.println("Maybe we could take the buses.");
		}
		
		else 
		{
			System.out.println("We still can't decide.");
		}
		
		if (people > buses)
		{
			System.out.println("Alright, let's just take the buses.");
		}
		
		else 	
		{
			System.out.println("Fine, let's stay home then.");
		}
	}
}