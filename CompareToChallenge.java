// Fred Luartes, 2/24/2016
// Compare to Challenge: This program uses the function compareTo(). 

public class CompareToChallenge {
	public static void main(String[] args) {
		int a, b, c, d, e, f, g, h, i; 
		
		a = "test".compareTo("testing");
		System.out.println("Comparing \"test\" to \"testing\" produces " + a);
		
		b = "grape".compareTo("grapefruit");
		System.out.println("Comparing \"grape\" to \"grapefruit\" produces " + b);
		
		c = "corn".compareTo("cornflakes");
		System.out.println("Comparing \"corn\" to \"cornflakes\" produces " + c);
		
		d = "road".compareTo("roadfill");
		System.out.println("Comparing \"road\" to \"roadfill\" produces " + d);
		
		e = "full".compareTo("full tank");
		System.out.println("Comparing \"full\" to \"full tank\" produces " + e);
		
		f = "nemesis".compareTo("nemesissiselhd");
		System.out.println("Comparing \"nemesis\" to \"nemesissiselhd\" produces " + f);
		
		g = "juice".compareTo("juicyfruit''");
		System.out.println("Comparing \"juice\" to \"juicyfruit''\" produces " + g);
		
		h = "first".compareTo("hundred");
		System.out.println("Comparing \"first\" to \"apple\" produces " + h);
		
		i = "rock".compareTo("rattan");
		System.out.println("Comparing \"rock\" to \"rattan\" produces " + i);
	}
}