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

    public static void main(String[] args) {
        
        //Jeu de test de piece
        Piece pion = new Piece(false, "pion");//doit afficher P
        Piece cavalier = new Piece(true, "cavalier");//doit afficher c
        Piece roi = new Roi(true);//doit afficher r 
        Piece roi2 = new Roi(false);//doit afficher R
        Piece dame = new Dame(true);//doit afficher d
        Piece tour = new Tour(false);//doit afficher T

        //Jeu de pièces noires pour le plateau
        Piece roiN = new Roi(false);
        Piece dameN = new Dame(false);
        Piece tourN1 = new Tour(false);
        Piece tourN2 = new Tour(false);
		Piece fouN1 = new Fou(false);
		Piece fouN2 = new Fou(false);
		Piece cavalierN1 = new Cavalier(false);
		Piece cavalierN2 = new Cavalier(false);
        Piece pionN1 = new Pion(false);
        Piece pionN2 = new Pion(false);
        Piece pionN3 = new Pion(false);
        Piece pionN4 = new Pion(false);
		Piece pionN5 = new Pion(false);
		Piece pionN6 = new Pion(false);
		Piece pionN7 = new Pion(false);
		Piece pionN8 = new Pion(false);

        //Jeu de pièces blanches pour le plateau
        Piece roiB = new Roi(true);
        Piece dameB = new Dame(true);
        Piece tourB1 = new Tour(true);
        Piece tourB2 = new Tour(true);        
		Piece fouB1 = new Fou(true);
		Piece fouB2 = new Fou(true);
		Piece cavalierB1 = new Cavalier(true);
		Piece cavalierB2 = new Cavalier(true);
        Piece pionB1 = new Pion(true);
        Piece pionB2 = new Pion(true);
        Piece pionB3 = new Pion(true);
        Piece pionB4 = new Pion(true);
		Piece pionB5 = new Pion(true);
		Piece pionB6 = new Pion(true);
		Piece pionB7 = new Pion(true);
		Piece pionB8 = new Pion(true);


        //test de la fonction de la classe Piece
        System.out.println(pion.toString());
        System.out.println(cavalier.toString());
        System.out.println(roi.toString());
        System.out.println(roi2.toString());
        System.out.println(dame.toString());
        System.out.println(tour.toString());

        System.out.println("**********************");

        //Jeu de test de case
        Case A1 = new Case(true, roi);//la case est blanche et le roi est blanc donc doit afficher r
        Case A4 = new Case(false, pion);//la case est noire et le pion est noir donc doit afficher P
        Case A2 = new Case(false);//la case est noire donc doit afficher *
        Case A3 = new Case(true);//la case est blanche donc doit afficher -
        Case A5 = new Case(false);
        Case A6 = new Case(true);

        System.out.println("**********************");

        /*
        *test des fonctions de la classe Case :
        
        * Testons la fonction estVide() :
        */
        System.out.println(A1.estVide());//doit afficher false
        System.out.println(A4.estVide());//doit afficher false
        System.out.println(A2.estVide());//doit afficher true
        System.out.println(A3.estVide());//doit afficher true

        System.out.println("**********************");

        /*
        * Testons maintenant la fonction remplirPiece(Piece p) :
        */
        A2.remplirPiece(dame);
        A3.remplirPiece(tour);
        System.out.println(A2.estVide());//doit afficher maintenant false
        System.out.println(A3.estVide());//doit afficher maintenant false

        System.out.println("**********************");

        /*
        * Testons maintenant la fonction enleverPiece() :
        */
        A4.enleverPiece();
        System.out.println(A4.estVide());//doit afficher maintenant true

        System.out.println("**********************");

        /*
        * Testons maintenant la fonction toString() :
        */
        System.out.println(A1.toString());//doit afficher r
        System.out.println(A4.toString());//doit afficher *
        System.out.println(A2.toString());//doit afficher d
        System.out.println(A3.toString());//doit afficher T
        System.out.println(A5.toString());//doit afficher *
        System.out.println(A6.toString());//doit afficher -

        System.out.println("**********************");

        //Création d'un jeu d'echecs
        Echecs e = new Echecs();
        
        //Création d'un plateau
        Plateau p = new Plateau(8, 8);

        //On place les pièces sur le plateau
		p.remplirCase(0, 0, tourN1);
		p.remplirCase(0, 1, cavalierN1);
		p.remplirCase(0, 2, fouN1);
		p.remplirCase(0, 3, dameN);
		p.remplirCase(0, 4, roiN);
		p.remplirCase(0, 5, fouN2);
		p.remplirCase(0, 6, cavalierN2);
		p.remplirCase(0, 7, tourN2);
		p.remplirCase(1, 0, pionN1);
		p.remplirCase(1, 1, pionN2);
		p.remplirCase(1, 2, pionN3);
		p.remplirCase(1, 3, pionN4);
		p.remplirCase(1, 4, pionN5);
		p.remplirCase(1, 5, pionN6);
		p.remplirCase(1, 6, pionN7);
		p.remplirCase(1, 7, pionN8);
		
		p.remplirCase(7, 0, tourB1);
		p.remplirCase(7, 1, cavalierB1);
		p.remplirCase(7, 2, fouB1);
		p.remplirCase(7, 3, dameB);
		p.remplirCase(7, 4, roiB);
		p.remplirCase(7, 5, fouB2);
		p.remplirCase(7, 6, cavalierB2);
		p.remplirCase(7, 7, tourB2);
		p.remplirCase(6, 0, pionB1);
		p.remplirCase(6, 1, pionB2);
		p.remplirCase(6, 2, pionB3);
		p.remplirCase(6, 3, pionB4);
		p.remplirCase(6, 4, pionB5);
		p.remplirCase(6, 5, pionB6);
		p.remplirCase(6, 6, pionB7);
		p.remplirCase(6, 7, pionB8);

        System.out.println("**********************");

        //On affiche le plateau 
        System.out.println("Bienvenue sur la partie d'échecs!!!");
        p.afficher();

        System.out.println("**********************");


		Deplacement d = new Deplacement(6,4,5,4);
		e.jouerTour(d, true, p);
		p.afficher();
		System.out.println("**********************");
		
		Deplacement d1 = new Deplacement(7,1,5,2);
		e.jouerTour(d1, true, p);
		p.afficher();
		System.out.println("**********************");
		
		Deplacement d2 = new Deplacement(0,1,2,2);
		e.jouerTour(d2, false, p);
		p.afficher();
		System.out.println("**********************");
		
		Deplacement d3 = new Deplacement(0,5,4,1);
		e.jouerTour(d3, false, p);
		p.afficher();
		System.out.println("**********************");
		
		Deplacement d4 = new Deplacement(7,3,3,7);
		e.jouerTour(d4, true, p);
		p.afficher();
		System.out.println("**********************");
		
		Deplacement d5 = new Deplacement(3,7,3,1);
		e.jouerTour(d5, true, p);
		p.afficher();
		System.out.println("**********************");
		
		Deplacement d6 = new Deplacement(7,4,7,3);
		e.jouerTour(d6, true, p);
		p.afficher();
		System.out.println("**********************");
		
		Deplacement d7 = new Deplacement(7,0,7,4);
		e.jouerTour(d7, true, p);
		p.afficher();        

	}

}