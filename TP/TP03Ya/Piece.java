
public class Piece {
	private boolean couleur ;
	private String nom;
	
	public Piece(boolean couleur, String nom) {
		this.couleur = couleur;
		this.nom = nom;
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
}
