
public class Combat {
	public static void main(String[] args) {
		Information i = new Information(500,500,500);
		Information i2 = new Information(400,800,600);
		Personnage p = new Personnage("Jean",i,i);
		Personnage p2 =	new Personnage("Chris",i2,i2);
		
		p.lutte(p2);
	}
}
