
public abstract class Joueur {

	private Plateau plateau;
	private Bateau[] bateaux;
	private boolean rejouer;
	
	public Joueur(Plateau plateau) {
		this.plateau = plateau;
	}
	
	public boolean aPerdu() {
		for(Bateau b : bateaux) {
			if(!b.estCouler())
				return false;
		}
		return true;
	}
	
	public abstract void attaque(Plateau plateau, int y, int x); // On met rejouer a true.
	public ab
	
	public boolean peutRejouer() {
		return rejouer;
	}
	
}
