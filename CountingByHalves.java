// Fred Luartes, 3/22/2016
// Counting by Halves: This program uses a for loop to count from -10.0 to 10.0 in 0.5 increments. 

public class CountingByHalves
{
	public static void main(String[] args)
	{
		System.out.println("x");
		System.out.println("-----------");
		
		for(double x = -10.0; x <= 10; x = x + 0.5)
		{
			System.out.println(x);
		}
	}
}