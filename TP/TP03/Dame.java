public class Dame extends Piece{
    
    public Dame(boolean couleur) {
        super(couleur, "dame");
    }

	public boolean estValide(Deplacement d, Plateau p) {
		if(super.estValide(d, p)) {
			if(d.typeDeplacement() == 'c') {
				return false;
			}
			return true;
		}
		return false;
	}


}
