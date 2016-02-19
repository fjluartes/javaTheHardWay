// Fred Luartes, 2/19/2016
// This program has more variables, and teaches strings, and adding computations in println. 

public class MoreVariablesAndPrinting
{
	public static void main(String [] args)
	{
		String Name, Eyes, Teeth, Hair;
		int Age, Height, Weight;
		double HeightCM, WeightKG;
		
		Name = "Fred Luartes";
		Age = 26;
		Height = 65; // inches
		Weight = 142; // lbs
		Eyes = "Brown";
		Teeth = "White";
		Hair = "Black";
		
		HeightCM = Height * 2.54;
		WeightKG = Weight / 2.2;
		
		System.out.println("Let's talk about " + Name + ".");
		System.out.println("He's " + Height + " inches (or " + Math.round(HeightCM) + " cm) tall.");
		System.out.println("He's " + Weight + " lbs (or " + Math.round(WeightKG) + " kg) heavy.");
		System.out.println("Actually, that's not too heavy.");
		System.out.println("He's got " + Eyes + " eyes and " + Hair + " hair.");
		System.out.println("His teeth are usually " + Teeth + " depending on the coffee.");
		
		// This line is tricky; Try to get it exactly right. 
		System.out.println("If I add " + Age + ", " + Height + ", and " + Weight + " I get " + (Age + Height + Weight) + ".");
	}
}