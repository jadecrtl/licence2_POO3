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
        if (this.getPiece()==null) {//si la case est vide alors on retourne true sinon false
            return true;
        }
        return false;
    }
    
    public void remplirPiece(Piece p) {
        if (this.getPiece() == null) {
            this.piece = p;
        }
    }

    public void enleverPiece() {
        if (this.getPiece() != null) {
            this.piece = null;
        }
    }

    public String toString() {
        if (this.getPiece() != null) {
            return String.valueOf(piece.toString().charAt(0));
        }
        else{
            if (this.couleurCase == true) {
                return "-";
            }
            else {
                return "*";
            }
        }
        
    }



    

}
