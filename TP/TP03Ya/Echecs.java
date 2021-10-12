
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
		if(p.getCase(d.getX0(), d.getY0()).getP().getCouleur() != joueur) {
			System.out.println("Ce n'est pas votre pièce !");
			return;
		}
		if(p.getCase(d.getX0(), d.getY0()).getP().estValide(d, p)) {
			Piece piece = p.getCase(d.getX0(), d.getY0()).getP();
			p.getCase(d.getX0(), d.getY0()).enleverPiece();
			p.getCase(d.getX1(), d.getY1()).remplirPiece(piece);
		}
	}
	
	public static void main(String[] args) {
		Echecs e = new Echecs();
		Plateau p = new Plateau(8,8);
		Piece pion1 = new Pion(true);
		Piece pion2 = new Pion(true);
		Piece pion3 = new Pion(true);
		Piece pion4 = new Pion(true);
		Piece pion11 = new Pion(true);
		Piece pion22 = new Pion(true);
		Piece pion33 = new Pion(true);
		Piece pion44 = new Pion(true);
		
		Piece pion5 = new Pion(false);
		Piece pion6 = new Pion(false);
		Piece pion7 = new Pion(false);
		Piece pion8 = new Pion(false);
		Piece pion55 = new Pion(false);
		Piece pion66 = new Pion(false);
		Piece pion77 = new Pion(false);
		Piece pion88 = new Pion(false);
		
		Piece cavalier1 = new Cavalier(true);
		Piece cavalier2 = new Cavalier(true);
		
		Piece cavalier3 = new Cavalier(false);
		Piece cavalier4 = new Cavalier(false);
		
		Piece fou1 = new Fou(true);
		Piece fou2 = new Fou(true);
		
		Piece fou3 = new Fou(false);
		Piece fou4 = new Fou(false);
		
		Piece tour1 = new Tour(true);
		Piece tour2 = new Tour(true);
		
		Piece tour3 = new Tour(false);
		Piece tour4 = new Tour(false);
		
		Piece dame1 = new Dame(true);
		
		Piece dame2 = new Dame(false);
		
		Piece roi1 = new Roi(true);
		
		Piece roi2 = new Roi(false);
		
		p.remplirCase(0, 0, tour3);
		p.remplirCase(0, 1, cavalier3);
		p.remplirCase(0, 2, fou3);
		p.remplirCase(0, 3, dame2);
		p.remplirCase(0, 4, roi2);
		p.remplirCase(0, 5, fou4);
		p.remplirCase(0, 6, cavalier4);
		p.remplirCase(0, 7, tour4);
		p.remplirCase(1, 0, pion5);
		p.remplirCase(1, 1, pion6);
		p.remplirCase(1, 2, pion7);
		p.remplirCase(1, 3, pion8);
		p.remplirCase(1, 4, pion55);
		p.remplirCase(1, 5, pion66);
		p.remplirCase(1, 6, pion77);
		p.remplirCase(1, 7, pion88);
		
		p.remplirCase(7, 0, tour1);
		p.remplirCase(7, 1, cavalier1);
		p.remplirCase(7, 2, fou2);
		p.remplirCase(7, 3, dame1);
		p.remplirCase(7, 4, roi1);
		p.remplirCase(7, 5, fou2);
		p.remplirCase(7, 6, cavalier2);
		p.remplirCase(7, 7, tour2);
		p.remplirCase(6, 0, pion1);
		p.remplirCase(6, 1, pion2);
		p.remplirCase(6, 2, pion3);
		p.remplirCase(6, 3, pion4);
		p.remplirCase(6, 4, pion11);
		p.remplirCase(6, 5, pion22);
		p.remplirCase(6, 6, pion33);
		p.remplirCase(6, 7, pion44);
		
		p.afficher();
		System.out.println("===============");
		
		Deplacement d = new Deplacement(6,4,5,4);
		e.jouerTour(d, true, p);
		p.afficher();
		System.out.println("===============");
		
		Deplacement d1 = new Deplacement(7,1,5,2);
		e.jouerTour(d1, true, p);
		p.afficher();
		System.out.println("===============");
		
		Deplacement d2 = new Deplacement(0,1,2,2);
		e.jouerTour(d2, false, p);
		p.afficher();
		System.out.println("===============");
		
		Deplacement d3 = new Deplacement(0,5,4,1);
		e.jouerTour(d3, false, p);
		p.afficher();
		System.out.println("===============");
		
		Deplacement d4 = new Deplacement(7,3,3,7);
		e.jouerTour(d4, true, p);
		p.afficher();
		System.out.println("===============");
		
		Deplacement d5 = new Deplacement(3,7,3,1);
		e.jouerTour(d5, true, p);
		p.afficher();
		System.out.println("===============");
		
		Deplacement d6 = new Deplacement(7,4,7,3);
		e.jouerTour(d6, true, p);
		p.afficher();
		System.out.println("===============");
		
		Deplacement d7 = new Deplacement(7,0,7,4);
		e.jouerTour(d7, true, p);
		p.afficher();
	}

}
