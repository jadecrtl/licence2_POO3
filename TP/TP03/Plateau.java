public class Plateau {
    
    private int longueur;
    private int largeur;
    private Case[][] cases;
    
    /*
        - Un constructeur public Plateau(int longueur, int largeur) qui
        génère un plateau de taille longueur × largeur et de couleur alter-
        nées (la Case à (0,0) est noire).
    */
    
    public Plateau(int longueur, int largeur) {
        this.cases = Case[longueur][largeur];

    }
    
    /*
        - Une méthode public boolean horsLimite(int x, int y) qui teste
        si la position (x,y) correspond bien à une case du plateau.
    */

    public boolean horsLimite(int x, int y) {
        return false;
    }
    
    /*
        - Un getter public Case getCase(int x,int y) qui renvoie la Case
        de coordonnées x et y, ainsi que les méthodes suivantes

    public Case getCase(int x, int y) {

    }
    */
    public void videCase(int x, int y) {

    }

    //pour interagir avec la Case.
    public void remplirCase(int x, int y, Piece p) {

    }

    //Une méthode qui affiche le plateau (utiliser la méthode toString() de Case ).
    public void afficher() {

    }






}
