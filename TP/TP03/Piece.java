public class Piece {

    private boolean couleur;//si true alors blanc et si false alors noire
    private String nomPiece;

    public Piece(boolean couleur, String nomPiece) {
        this.couleur = couleur;
        this.nomPiece = nomPiece;
    }

    public String getNomPiece() {
        return this.nomPiece;
    }

    public boolean getCouleur() {
        return this.couleur;
    }

    public String toString() {
        if (this.couleur == true) {
            return this.nomPiece.charAt(0)+" ";
        }
        return this.nomPiece.substring(0,1).toUpperCase()+" ";
    }

	public boolean estValide(Deplacement d, Plateau p) {
		if(p.horsLimite(d)) {
			return false;
		}
		if(d.typeDeplacement() == 'x') {
			return false;
		}
		if(p.getCase(d.getX1(), d.getY1()).getPiece() != null) {
			if(p.getCase(d.getX1(), d.getY1()).getPiece().couleur == this.couleur) {
				return false;
			}
		}
		return true;
	}


}