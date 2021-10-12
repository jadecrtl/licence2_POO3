
public class Piece {
	private boolean couleur ;
	private String nom;
	
	public Piece(boolean couleur, String nom) {
		this.couleur = couleur;
		this.nom = nom;
	}
	
	public boolean getCouleur() {
		return this.couleur;
	}
	
	public String toString() {
		String res = "";
		if(this.couleur) {
			res = this.nom;
		} else {
			res = this.nom.toLowerCase();
		}
		return res;
	}
	
	public boolean estValide(Deplacement d, Plateau p) {
		if(p.horsLimite(d)) {
			return false;
		}
		if(d.typeDeplacement() == 'x') {
			return false;
		}
		if(p.getCase(d.getX1(), d.getY1()).getP() != null) {
			if(p.getCase(d.getX1(), d.getY1()).getP().couleur == this.couleur) {
				return false;
			}
		}
		return true;
	}
}
