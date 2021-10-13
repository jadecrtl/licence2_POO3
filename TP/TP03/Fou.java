public class Fou extends Piece{
    
    public Fou(boolean couleur) {
        super(couleur, "fou");
    }

	public boolean estValide(Deplacement d, Plateau p) {
		if(super.estValide(d, p)) {
			if(d.typeDeplacement() == 'd') {
				return true;
			}
			return false;
		}
		return false;
	}


}
