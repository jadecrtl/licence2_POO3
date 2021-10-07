public class Lanceur {
    public static void main(String[] args) {
        Joueur j = new Joueur();//création d'un joueur
        j.setNom(j.demanderNom());//modification du nom
        while(j.veutJouer()) {//tant que le joueur dit qu'il veut jouer (commencer une partie)
            int[] dimensions = j.demanderDimensions();//initialisation des dimensions du plateau
            int nbMines = j.demanderNbMines();//initialisation du nombre de mines
            Plateau p = new Plateau(dimensions[0], dimensions[1], nbMines);//création du plateau avec les 2 infos ci-dessus
            Jeu jouons = new Jeu(j, p);//initialisation du jeu
            jouons.jouer();//la partie commence
            p.afficheTout();//quand la partie est fini on montre tout
        }
        j.finish();
    }
}