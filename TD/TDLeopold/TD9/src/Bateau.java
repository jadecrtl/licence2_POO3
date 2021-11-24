
public class Bateau {

	private Case[] cases;
	private boolean couler;
	
	public Bateau(Case[] cases) {
		this.cases = cases;
	}
	
	public boolean estCouler() {
		if(couler)
			return couler;
		int count = 0;
		for(Case c : cases) {
			if(!c.estToucher())
				count++;
		}
		couler = count == cases.length;
		return couler;
	}
	
}
