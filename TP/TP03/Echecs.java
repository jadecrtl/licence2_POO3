public class Echecs {

	private boolean joueur;
	
	public Echecs() {
		this.joueur = true;
	}
	
	public void jouerTour(Deplacement d, boolean joueur, Plateau p) {
		if(p.horsLimite(d)) {
			System.out.println("La case est hors limite !");
			return;
		}
		if(p.getCase(d.getX0(), d.getY0()).estVide()) {
			System.out.println("Il n'y a pas de pièce sur cette case !");
			return;
		}
		if(p.getCase(d.getX0(), d.getY0()).getPiece().getCouleur() != joueur) {
			System.out.println("Ce n'est pas votre pièce !");
			return;
		}
		if(p.getCase(d.getX0(), d.getY0()).getPiece().estValide(d, p)) {
			Piece piece = p.getCase(d.getX0(), d.getY0()).getPiece();
			p.getCase(d.getX0(), d.getY0()).enleverPiece();
			p.getCase(d.getX1(), d.getY1()).remplirPiece(piece);
		}
	}



}