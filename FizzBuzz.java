// Fred Luartes, 3/22/2016
// FizzBuzz: This program prints numbers from 1-100. For multiples of 3, print Fizz. For multiples of 5, print Buzz. For multiples of both 3 and 5, print FizzBuzz. 

public class FizzBuzz
{
	public static void main(String[] args)
	{
		for (int num = 1; num <= 100; num++)
		{
			if ((num % 3) == 0 && (num % 5) == 0)
			{
				System.out.println("FizzBuzz");
			}
			else if ((num % 3) == 0)
			{
				System.out.println("Fizz");
			}
			else if ((num % 5) == 0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(num);
			}
		}
	}
}