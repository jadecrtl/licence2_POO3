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
        this.etatsInit();
    }

	private void etatsInit() {
		for(int i = 1; i < this.hauteur+1; i++) {
			for(int j = 1; j < this.largeur+1; j++) {
				this.etats[i][j] = -1; //toutes les cases sont initialisées à -1
			}
		}
	}

    private void ajouteMinesAlea() {
        Random rd = new Random();
        int nbMines = this.nbMines;
        while (nbMines != 0) {
            int hauteurAlea = rd.nextInt(hauteur)+1;
            int largeurAlea = rd.nextInt(largeur)+1;
            if (placeMines[hauteurAlea][largeurAlea] != true) {//Testons si à cette position il y a une mine
                placeMines[hauteurAlea][largeurAlea] = true;//S'il n'y en a pas alors on en met une
                nbMines--;//On décrémente nbMines pour ne pas en rajouter plus qu'on nous le demande
            }
        }
    }

    private void calculeAdjacence() {
        for (int i=1; i<=hauteur; i++) {//Ces 2 for permettent de scanner toutes les cases du démineur
            for (int j=1; j<=largeur; j++) {
                adja[i][j] = compte(i,j);//À chaques cases on appelle la fonction compte(i,j)
            }
        }
    }

    private int compte(int x, int y) {//Cette fonction permet de s'avoir aux alentours d'une case le nombre de mines
        int n = 0;//Initialisation d'un entier qui sera ce qu'on retournera à la fin
        for (int i=x-1; i<x+2; i++) {//Ces 2 for représente le carré autour de la case 
            for (int j=y-1; j<y+2; j++) {
                if (placeMines[i][j]) {//À chaques cases du carré on regarde s'il y a une mine
                    n++;
                }
            }
        }
        return n;//Le nombre de mines adjacentes à la case
    }

    public void afficheTout() {
		System.out.println("Mines : " + this.nbMines + " / Drapeaux : " + this.nbDrapeaux);
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
