public class Jeu {
    private Joueur j;
    private Plateau p;

    public Jeu(Joueur j, Plateau p) {
        this.j = j;
        this.p = p;
    }

    public void jouer() {
		this.p.afficheCourant();
		while(!this.p.jeuGagne() && !this.p.jeuPerdu()) {
			if(this.j.demanderAction() == 'r') {
				int[] coor = this.j.demanderCoordonnes();
				this.p.revelerCase(coor[0], coor[1]);
			}
            else {
				int[] coor = this.j.demanderCoordonnes();
				this.p.drapeauCase(coor[0], coor[1]);
			}
			this.p.afficheCourant();		
        }
        if(this.p.jeuGagne()) {
			System.out.println("Vous avez gagné !");
			return;
		}
		if(this.p.jeuPerdu()) {
			System.out.println("Vous avez perdu :(");
			return;
		}
    }






}
