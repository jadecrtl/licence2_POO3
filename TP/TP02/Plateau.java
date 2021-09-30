import java.util.Random;

public class Plateau {
    
    private int largeur;
    private int hauteur;
    private int nbMines;
    private int nbDrapeaux;
    private boolean[][] placeMines;
    private int[][] etats;
    private int[][] adja;

    public Plateau (int largeur, int hauteur, int nbMines, int nbDrapeaux) {
        this.hauteur = hauteur;
        this.largeur = largeur;
        this.nbMines = nbMines;
        this.nbDrapeaux = 0;
        this.placeMines = new boolean[this.hauteur+2][this.largeur+2];
        this.etats = new int[this.hauteur+2][this.largeur+2];
        this.adja = new int [this.hauteur+2][this.largeur+2];
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


}
