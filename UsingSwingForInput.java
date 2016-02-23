// Fred Luartes, 2/22/2016
// Using Swing for Input: This program displays input dialogs, then saves them as strings. The input variable was put into another variable age for conversion to int.

import javax.swing.*;

public class UsingSwingForInput
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name? ");
		
		String input = JOptionPane.showInputDialog("How old are you? ");
		int age = Integer.parseInt(input);
		
		System.out.println("Hello, " + name + ".");
		System.out.println("Next year, you'll be " + (age + 1) + ".");
		
		System.exit(0);
	}
}