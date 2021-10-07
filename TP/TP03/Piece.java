public class Piece {

    private boolean couleur;//si true alors blanc et si false alors noir
    private String nomPiece;

    public Piece(boolean couleur, String nomPiece) {
        this.couleur = couleur;
        this.nomPiece = nomPiece;
    }

    public String toString() {
        if (this.couleur == true) {
            return this.nomPiece.charAt(0)+" ";
        }
        return this.nomPiece.substring(0,1).toUpperCase()+" ";
    }



}