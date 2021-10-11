public class Case {
    
    private boolean couleurCase;//si true alors blanc et si false alors noire
    private Piece piece;

    public Case(boolean couleurCase, Piece piece) {
        this.couleurCase = couleurCase;
        this.piece = piece;
    }

    public Case(boolean couleurCase) {
        this.couleurCase = couleurCase;
        this.piece = null;
    }

    public Piece getPiece() {
        return piece;
    }

    public boolean estVide() {
        if (this.piece ==null) {//si la case est vide alors on retourne true sinon false
            return true;
        }
        return false;
    }
    
    public void remplirPiece(Piece p) {
        if (this.estVide()) {
            this.piece = p;
        }
    }

    public void enleverPiece() {
        if (this.estVide()) {
            this.piece = null;
        }
    }

    public String toString() {
        if(this.estVide() && this.couleurCase) {
            return "- ";
        }
        else {
            if(this.estVide() && !this.couleurCase) {
                return "* ";
            }
        }
        return this.piece.toString().charAt(0)+" ";
    }



    

}
