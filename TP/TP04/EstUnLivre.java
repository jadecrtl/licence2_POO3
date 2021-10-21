public class EstUnLivre extends Predicat {
	
	boolean estVrai(Media m) {
		if(m instanceof Livre) {
			return true;
		}
		return false;
	}
}
