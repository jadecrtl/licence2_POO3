
public class Cavalier extends Piece{

	public Cavalier(boolean couleur) {
		super(couleur, "Cavalier");
	}
	
	public boolean estValide(Deplacement d, Plateau p) {
		if(super.estValide(d, p)) {
			if(d.typeDeplacement() == 'c') {
				return true;
			}
			return false;
		}
		return false;
	}

}
