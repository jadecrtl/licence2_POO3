
public class Case {
	private boolean couleur;
	private Piece p;
	
	public Case(boolean couleur) {
		this.p = null;
		this.couleur = couleur;
	}
	
	public Piece getP() {
		return p;
	}
	
	public boolean estVide() {
		if(this.p == null) {
			return true;
		}
		return false;
	}
	
	public void remplirPiece(Piece p) {
		if(this.estVide()) {
			this.p = p;
		}
	}
	
	public void enleverPiece() {
		if(!this.estVide()) {
			this.p = null;
		}	
	}
	
	public String toString() {
		if(this.estVide() && this.couleur) {
			return "- ";
		} else {
			if(this.estVide() && !this.couleur) {
				return "* ";
			}
		}
		return this.p.toString().charAt(0)+" ";
	}
	
}
