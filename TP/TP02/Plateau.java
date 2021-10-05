import java.util.Random;

public class Plateau {
    
    private int largeur;
    private int hauteur;
    private int nbMines;
    private int nbDrapeaux;
    private boolean[][] placeMines;
    private int[][] etats;
    private int[][] adja;

    public Plateau (int largeur, int hauteur, int nbMines) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.nbMines = nbMines;
        this.nbDrapeaux = 0;
        this.placeMines = new boolean[this.hauteur+2][this.largeur+2];
        this.etats = new int[this.hauteur+2][this.largeur+2];
        this.adja = new int [this.hauteur+2][this.largeur+2];
        this.ajouteMinesAlea();
        this.calculeAdjacence();
    }

    private void ajouteMinesAlea() {
        Random rd = new Random();
        int nbMines = this.nbMines;
        while (nbMines != 0) {
            int hauteurAlea = rd.nextInt(hauteur)+1;
            int largeurAlea = rd.nextInt(largeur)+1;
            if (placeMines[hauteurAlea][largeurAlea] != true) {
                placeMines[hauteurAlea][largeurAlea] = true;
                nbMines--;
            }
        }
    }

    private void calculeAdjacence() {
        for (int i=1; i<=hauteur; i++) {
            for (int j=1; j<=largeur; j++) {
                adja[i][j] = compte(i,j);
            }
        }
    }

    private int compte(int x, int y) {
        int n = 0;
        for (int i=x-1; i<x+2; i++) {
            for (int j=y-1; j<y+2; j++) {
                if (placeMines[i][j]) {
                    n++;
                }
            }
        }
        return n;
    }

    public void afficheTout() {
		System.out.println("Mines : "+this.nbMines+" / Drapeaux : "+this.nbDrapeaux);
		for(int i = 1; i < this.hauteur+1;i++) {
			for(int j=1; j < this.largeur+1; j++) {
				if(this.placeMines[i][j]) {
					System.out.print("* ");
				} else {
					System.out.print(this.adja[i][j]+" ");
				}
			}
			System.out.print("\n");
		}
    }

    public void revelerCase(int x, int y) {
        if (x < 1 || x > this.hauteur || y < 1 || y > this.largeur) {
            System.out.println("Hors jeu!!");
            return;
        }
        if (this.etats[x][y] == this.adja[x][y]) {
            System.out.println("La case est déjà révélée.");
            return;
        }
        this.etats[x][y] = this.adja[x][y];
    }

    public void drapeauCase(int x, int y) {
        if (this.etats[x][y] > 8) {
            this.etats[x][y] -= 10;
            nbDrapeaux--;
        }
        else {
            this.etats[x][y] += 10;
            nbDrapeaux++;
        }
    }

    public void afficheCourant() {
        for (int i=1; i<this.hauteur+1; i++) {
            for (int j=1; j<this.largeur+1; j++) {
                if (this.etats[i][j] == -1) {
                    System.out.println(". ");
                }
                else if (this.etats[i][j] > 8) {
                    System.out.println("? ");
                }
                else if (this.placeMines[i][j]){
                    System.out.println("* ");
                }
                else {
                    System.out.println(this.etats[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }

    public boolean jeuPerdu() {
        for (int i=1; i<hauteur+1; i++) {
            for (int j=1; j<largeur+1; j++) {
                if (this.placeMines[i][j] && this.etats[i][j] > -1 || this.etats[i][j] < 9) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean jeuGagne() {
        for (int i=1; i<hauteur+1; i++) {
            for (int j=1; j<largeur+1; j++) {
                if (this.placeMines[i][j] && this.etats[i][j] > -1 || this.etats[i][j] < 9) {
                    return false;
                }
                if (this.placeMines[i][j] && this.etats[i][j] <= -1 || this.etats[i][j] >= 9) {
                    return false;
                }
            }
        }
        return true;        
    }

}
