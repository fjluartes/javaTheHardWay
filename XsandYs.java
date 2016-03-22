// Fred Luartes, 3/22/2016
// Xs and Ys: This program uses a for loop to count from -10.0 to 10.0 in 0.5 increments and displays the square of -10.0 to 10. 

public class XsandYs
{
	public static void main(String[] args)
	{
		System.out.println("x");
		System.out.println("--------------");
		
		for(double x = -10.0; x <= 10; x = x + 0.5)
		{
			double y = Math.pow(x, 2);
			System.out.println(x + "\t" + y);
		}
	}
}