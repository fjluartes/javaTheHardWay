// Fred Luartes, 2/22/2016
// A Boring Window: This program creates an empty window, with minimize, maximize, and close buttons. 

import javax.swing.*;

public class BoringWindow extends JFrame
{
	public static void main(String[] args)
	{
		JFrame f = new BoringWindow();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		f.setVisible(true);
	}
}