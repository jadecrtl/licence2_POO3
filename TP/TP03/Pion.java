public class Pion extends Piece{
    
    public Pion(boolean couleur) {
        super(couleur, "pion");
    }

	public boolean estValide(Deplacement d, Plateau p) {
		if(super.estValide(d, p)) {
			if(d.dist() == 1 && d.typeDeplacement() == 'v') {
				return true;
			}
			return false;
		}
		return false;
	}


}
