import java.util.Random;

public class PlateauYa {
	private int hauteur;
	private int largeur;
	private int nbMines;
	private int nbDrapeaux;
	private boolean[][] mines;
	private int[][] etats;
	private int[][] adja;
	
	public PlateauYa(int ha, int la, int mi) {
		this.hauteur = ha;
		this.largeur = la;
		this.nbMines = mi;
		this.nbDrapeaux = 0;
		this.mines = new boolean[ha+2*la+2][ha+2*la+2];
		this.etats = new int[ha+2*la+2][ha+2*la+2];
		this.adja = new int[ha+2*la+2][ha+2*la+2];
		this.ajouteMinesAlea();
		this.calculeAdjacence();
	}
	
	private void ajouteMinesAlea() {
		Random r = new Random();
		for(int i=0;i < this.nbMines; i++) {
			int x = 1+r.nextInt(this.hauteur);
			int y = 1+r.nextInt(this.largeur);
			while(this.mines[x][y]) {
				x = 1+r.nextInt(this.hauteur);
				y = 1+r.nextInt(this.largeur);
			}
			this.mines[x][y] = true;
		}
	}
	
	private void calculeAdjacence() {
		for(int i = 1; i < this.hauteur+1;i++) {
			for(int j=1; j < this.largeur+1; j++) {
				if(this.mines[i-1][j-1]) {
					this.adja[i][j]++;
				}
				if(this.mines[i-1][j]) {
					this.adja[i][j]++;
				}
				if(this.mines[i-1][j+1]) {
					this.adja[i][j]++;
				}
				if(this.mines[i][j-1]) {
					this.adja[i][j]++;
				}
				if(this.mines[i][j+1]) {
					this.adja[i][j]++;
				}
				if(this.mines[i+1][j-1]) {
					this.adja[i][j]++;
				}
				if(this.mines[i+1][j]) {
					this.adja[i][j]++;
				}
				if(this.mines[i+1][j+1]) {
					this.adja[i][j]++;
				}
			}
		}
	}
	
	public void afficheTout() {
		System.out.println("Mines : "+this.nbMines+" / Drapeaux : "+this.nbDrapeaux);
		for(int i = 1; i < this.hauteur+1;i++) {
			for(int j=1; j < this.largeur+1; j++) {
				if(this.mines[i][j]) {
					System.out.print("* ");
				} else {
					System.out.print(this.adja[i][j]+" ");
				}
			}
			System.out.print("\n");
		}
	}
	
	public void revelerCase(int x, int y) {
		if( x < 1 || x > this.hauteur || y < 1 || y > this.largeur) {
			System.out.println("La case est hors jeu !");
			return;
		}
		if(this.etats[x][y] == this.adja[x][y]) {
			System.out.println("La case a deja été revélée !");
			return;
		}
		this.etats[x][y] = this.adja[x][y];
	}
}
