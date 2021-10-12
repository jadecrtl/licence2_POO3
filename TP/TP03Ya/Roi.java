
public class Roi extends Piece{

	public Roi(boolean couleur) {
		super(couleur, "Roi");
	}
	
	public boolean estValide(Deplacement d, Plateau p) {
		if(super.estValide(d, p)) {
			if(d.typeDeplacement() == 'c' || d.dist() != 1) {
				return false;
			}
			return true;
		}
		return false;
	}
}
