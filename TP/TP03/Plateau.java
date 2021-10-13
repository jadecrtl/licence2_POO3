public class Plateau {
    
    private int longueur;
    private int largeur;
    private Case[][] cases;
        
    public Plateau(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.cases = new Case[longueur][largeur];
        for(int i=0; i < longueur; i++) {
			for(int j=0; j < largeur; j++) {
				if(i % 2 == 1) {
					if(j%2 == 1) {
						this.cases[i][j] = new Case(false);
					} else {
						this.cases[i][j] = new Case(true);
					}	
				} else {
					if(j%2 == 0) {
						this.cases[i][j] = new Case(false);
					} else {
						this.cases[i][j] = new Case(true);
					}	
				}
			}
		}
    }
    
    /*
        - Une méthode public boolean horsLimite(int x, int y) qui teste
        si la position (x,y) correspond bien à une case du plateau.
    */

    public boolean horsLimite(int x, int y) {
        if(x < 0 || x > this.longueur && y < 0 || y > this.largeur) {
            return true;
        }
        return false;
    }
    
    public boolean horsLimite(Deplacement d) {
		return this.horsLimite(d.getX1(), d.getY1());
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
        for (int i=0; i<this.longueur; i++) {;
            for (int j=0; j<this.largeur; j++) {
                System.out.print(this.cases[i][j]);
            }
            System.out.print("\n");
        }
    }


}
