
public class PlateauYa {
	private int longueur;
	private int largeur;
	private Case[][] c;
	
	public PlateauYa(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
		c = new Case[longueur][largeur];
		for(int i=0; i < longueur; i++) {
			for(int j=0; j < largeur; j++) {
				if(i % 2 == 1) {
					if(j%2 == 1) {
						this.c[i][j] = new Case(false);
					} else {
						this.c[i][j] = new Case(true);
					}	
				} else {
					if(j%2 == 0) {
						this.c[i][j] = new Case(false);
					} else {
						this.c[i][j] = new Case(true);
					}	
				}
			}
		}
	}
	
	public boolean horsLimite(int x, int y) {
		if(x > this.longueur || x < 0 && y > this.largeur || y < 0) {
			return true;
		}
		return false;
	}
	
	//public boolean horsLimite(Deplacement d) {
	//	return this.horsLimite(d.getX1(), d.getY1());
	//}
	
	public Case getCase(int x, int y) {
		return this.c[x][y];
	}
	
	public void videCase(int x, int y) {
		this.c[x][y] = null;
	}
	
	public void remplirCase(int x, int y, Piece p) {
		this.c[x][y].remplirPiece(p);
	}
	
	public void afficher() {
		for(int i=0; i < this.longueur; i++) {
			for(int j = 0; j < this.largeur; j++) {
				System.out.print(this.c[i][j].toString());
			}
			System.out.print("\n");
		}
	}
}
