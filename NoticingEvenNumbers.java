// Fred Luartes, 3/22/2016
// Noticing Even Numbers: This program uses a for loop to count from 1 to 20, and mark the even numbers.  

public class NoticingEvenNumbers
{
	public static void main(String[] args)
	{
		for(int num = 1; num <= 20; num = num + 1)
		{
			if (num % 2 == 0)
			{
				System.out.println(num + " <");
			}
			
			else
			{
				System.out.println(num);
			}		
		}
	}
}