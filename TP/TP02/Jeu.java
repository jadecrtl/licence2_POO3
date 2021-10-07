public class Jeu {
    private Joueur j;
    private Plateau p;

    public Jeu(Joueur j, Plateau p) {
        this.j = j;
        this.p = p;
    }

    public void jouer() {
		this.p.afficheCourant();//affichage de la grille du démineur
		while(!this.p.jeuGagne() && !this.p.jeuPerdu()) {//tant que le jeu n'est pas fini
			if(this.j.demanderAction() == 'r') {//on demande soit de révéler une case
				int[] coor = this.j.demanderCoordonnes();//on enregistre les coordonnées avec la fonction défini dans joueur
				this.p.revelerCase(coor[0], coor[1]);//on passe ces coordonnées à la fonction définit dans plateau pour révéler la case
			}
            else {//le cas où le joueur veut poser un drapeau
				int[] coor = this.j.demanderCoordonnes();
				this.p.drapeauCase(coor[0], coor[1]);
			}
			this.p.afficheCourant();//on met à jour la grille
        }
        if(this.p.jeuGagne()) {
			System.out.println("Vous avez gagné !");
			return;//on sort directement de la fonction jouer()
		}
		if(this.p.jeuPerdu()) {
			System.out.println("Vous avez perdu :(");
			return;//on sort directement de la fonction jouer()
		}
    }






}
