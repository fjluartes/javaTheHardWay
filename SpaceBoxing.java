// Fred Luartes, 2/21/2016 
// Space Boxing: This program gets the user's earth weight and converts it to the weight in the selected planet of choice. 

import java.util.Scanner;

public class SpaceBoxing 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double earthWeight, outsideEarthWeight; 
		int planetNumber;
		
		outsideEarthWeight = 0;
		
		System.out.println("Please enter your current earth weight. ");
		earthWeight = keyboard.nextDouble();
		
		System.out.println("I have information for the following planets. ");
		System.out.println("1. Venus\t 2. Mars\t 3. Jupiter ");
		System.out.println("4. Saturn\t 5. Uranus\t 6. Neptune ");
		
		System.out.println("Which planet are you visiting? ");
		planetNumber = keyboard.nextInt();
		
		if (planetNumber == 1)
		{
			outsideEarthWeight = earthWeight * 0.78;
			System.out.println("Your weight would be " + outsideEarthWeight + " pounds on that planet. ");
		}
		
		else if (planetNumber == 2)
		{
			outsideEarthWeight = earthWeight * 0.39;
			System.out.println("Your weight would be " + outsideEarthWeight + " pounds on that planet. ");
		}
		
		else if (planetNumber == 3)
		{
			outsideEarthWeight = earthWeight * 2.65;
			System.out.println("Your weight would be " + outsideEarthWeight + " pounds on that planet. ");
		}
		
		else if (planetNumber == 4)
		{
			outsideEarthWeight = earthWeight * 1.17;
			System.out.println("Your weight would be " + outsideEarthWeight + " pounds on that planet. ");
		}
		
		else if (planetNumber == 5)
		{
			outsideEarthWeight = earthWeight * 1.05;
			System.out.println("Your weight would be " + outsideEarthWeight + " pounds on that planet. ");
		}
		
		else if (planetNumber == 6)
		{
			outsideEarthWeight = earthWeight * 1.23;
			System.out.println("Your weight would be " + outsideEarthWeight + " pounds on that planet. ");
		}
		
		else 
		{
			System.out.println("That's not on the choices. ");
		}
	}
}