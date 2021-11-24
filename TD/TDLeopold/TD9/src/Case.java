
public class Case {

	private Bateau bateau;
	private boolean toucher;
	
	public Case(Bateau bateau) {
		this.bateau = bateau;
	}
	
	public boolean estDansUnBateau() {
		return bateau != null;
	}
	
	public boolean estToucher() {
		return toucher;
	}
	
}
