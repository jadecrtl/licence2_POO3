
public class Jeu {

	public static void main(String[] args) {
		final int longueur = 6, largeur = 6;
		
		Joueur j1 = new Joueur(new Plateau(longueur, largeur));
		Joueur j2 = new Joueur(new Plateau(longueur, largeur));

		lancerJeu(j1, j2);
		
	}
	
	public static void lancerJeu(Joueur j1, Joueur j2) {
		
		boolean tour = true;
		
		
		
		while(!j1.aPerdu() && !j2.aPerdu()) {
			
		}
		
	}
	
	/*
	
	Jeu {
	
	Joueur player1, player2;
	
	void jouer();
	void jouerTour();
	void partieFinie();
	
	}
	
	Joueur {
	
	Plateau plateau;
	List<Bateau> bateaux;
	Scanner sc;
	int nbBateauxCoules;
	
	Joueur();
	boolean aGagne();
	void attaquer(Case case, Joueur j2);
	boolean estTouche(Case case);
	
	}
	
	Plateau plateau {
	
	CaseRevel[][] grilleRevel;
	CaseBateau[][] grilleBateau;
	
	}
	
	Bateau bateau {
	
	int taille;
	
	}
	
	abstract Case {
	
	int x, y, etat;
	
	static caseFromString(String str);
	
	}
	
	CaseRevel extends Case;
	CaseBateau extends Case;
	
	*/
}
