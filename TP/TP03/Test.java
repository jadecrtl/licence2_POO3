public class Test {
    public static void main(String[] args) {
        
        //Jeu de test de piece
        Piece pion = new Piece(false, "pion");//doit afficher P
        Piece cavalier = new Piece(true, "cavalier");//doit afficher c
        Piece roi = new Roi(true);//doit afficher r 
        Piece roi2 = new Roi(false);//doit afficher R
        Piece dame = new Dame(true);//doit afficher d
        Piece tour = new Tour(false);//doit afficher T

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


    }
}
