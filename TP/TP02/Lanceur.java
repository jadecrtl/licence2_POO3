public class Lanceur {
    public static void main(String[] args) {
        Joueur j = new Joueur();
        j.setNom(j.demanderNom());
        while(j.veutJouer()) {
            int[] dimensions = j.demanderDimensions();
            int nbMines = j.demanderNbMines();
            Plateau p = new Plateau(dimensions[0], dimensions[1], nbMines);
            Jeu jouer = new Jeu(j, p);
            jouer.jouer();
            p.afficheTout();
        }
        j.finish();
    }
}