// Fred Luartes, 2/26/2016
// Fortune Cookie: This program simulates a fortune cookie using the Random() function. 
// Bonus: Add 6 random lotto numbers from 1-49.

import java.util.Random;

public class FortuneCookie {
	public static void main(String[] args) {
		Random r = new Random();
		int fortune, lotto1, lotto2, lotto3, lotto4, lotto5, lotto6;
		String response = "";
		
		fortune = 1 + r.nextInt(6);
		
		lotto1 = 1 + r.nextInt(49);
		lotto2 = 1 + r.nextInt(49);
		lotto3 = 1 + r.nextInt(49);
		lotto4 = 1 + r.nextInt(49);
		lotto5 = 1 + r.nextInt(49);
		lotto6 = 1 + r.nextInt(49);
		
		if (fortune == 1)
			response = "A person is never too old to learn.";
		
		else if (fortune == 2)
			response = "A new perspective will come with the new year.";
		
		else if (fortune == 3)
			response = "Beauty in its various forms appeal to you.";
		
		else if (fortune == 4)
			response = "Don't confuse recklessness with confidence.";
		
		else if (fortune == 5)
			response = "Emulate what you admire in your parents.";
		
		else if (fortune == 6)
			response = "Don't just spend time. Invest it.";
		
		System.out.println("Fortune cookie says: \"" + response + "\"");
		System.out.println(lotto1 + " - " + lotto2 + " - " + lotto3 + " - " + lotto4 + " - " + lotto5 + " - " + lotto6 + "\n");
	}
}