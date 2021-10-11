public class Plateau {
    
    private int longueur;
    private int largeur;
    private Case[][] cases;
        
    public Plateau(int largeur, int longueur) {
        this.cases = new Case[largeur][longueur];
        boolean couleurAlter = true;
        for (int i=0; i<this.largeur; i++) {
            for (int j=0; j<this.longueur; j++) {
                cases[i][j] = new Case(couleurAlter);
                couleurAlter = !couleurAlter;
            }
            if (largeur%2 == 0) {
                couleurAlter = !couleurAlter;
            }
        }
    }
    
    /*
        - Une méthode public boolean horsLimite(int x, int y) qui teste
        si la position (x,y) correspond bien à une case du plateau.
    */

    public boolean horsLimite(int x, int y) {
        if(x < 0 || x > this.largeur && y < 0 || y > this.longueur) {
            return true;
        }
        return false;
    }
    
    /*
        - Un getter public Case getCase(int x,int y) qui renvoie la Case
        de coordonnées x et y, ainsi que les méthodes suivantes
    */

    public Case getCase(int x, int y) {
        return cases[x][y];                
    }

    public void videCase(int x, int y) {
        if (!(cases[x][y].estVide())) {
            cases[x][y].enleverPiece();
        }
    }

    //pour interagir avec la Case.
    public void remplirCase(int x, int y, Piece p) {
        if(this.cases[x][y].estVide()) {
            this.cases[x][y].remplirPiece(p);
        }else{
            System.out.print("case deja remplie");
        }
    }


    //Une méthode qui affiche le plateau (utiliser la méthode toString() de Case ).
    public void afficher() {
        System.out.println("Bienvenue sur la partie d'échecs!!!");
        for (int i=0; i<this.largeur; i++) {;
            for (int j=0; j<this.longueur; j++) {
                this.cases[i][j].toString();
            }
            System.out.println();
        }
    }


}
