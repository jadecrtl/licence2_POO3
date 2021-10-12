
public class Tour extends Piece {

	public Tour(boolean couleur) {
		super(couleur, "Tour");
	}
	
	public boolean estValide(Deplacement d, Plateau p) {
		if(super.estValide(d, p)) {
			if(d.typeDeplacement() == 'h' || d.typeDeplacement() == 'v') {
				return true;
			}
			return false;
		}
		return false;
	}
}
