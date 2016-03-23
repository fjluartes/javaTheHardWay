// Fred Luartes, 3/23/2016
// Letter at a Time: This program asks the user for a string, then examines the number of characters in the string and each character in the string (including punctuation and whitespace).
// This program also counts the number of vowels in the string.
// If i <= length, there is an error at character = message.charAt(i) with i = 31 because of charAt being zero-based. 

import java.util.Scanner;

public class LetterAtATime
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int length, n = 0, vowelCount = 0;
		String message;
		char firstChar, lastChar, character;
		
		System.out.println("What is your message? ");
		message = keyboard.nextLine();
		length = message.length();
		firstChar = message.charAt(0);
		lastChar = message.charAt(length - 1);
		
		System.out.println("Your message is " + length + " characters long.");
		System.out.println("The first character is at position " + n + " and is '" + firstChar + "'");
		System.out.println("The first character is at position " + (length - 1) + " and is '" + lastChar + "'");
		for (int i = 0; i < length; i++)
		{
			character = message.charAt(i);
			System.out.println(i + " - '" + character + "'");
			if (character == 'a' || character == 'A')
			{
				vowelCount++;
			}
			
			else if (character == 'e' || character == 'E')
			{
				vowelCount++;
			}
			
			else if (character == 'i' || character == 'I')
			{
				vowelCount++;
			}
			
			else if (character == 'o' || character == 'O')
			{
				vowelCount++;
			}
			
			else if (character == 'u' || character == 'U')
			{
				vowelCount++;
			}
		}
		
		System.out.println("Your message contains vowels " + vowelCount + " times. Interesting!");
	}
}	