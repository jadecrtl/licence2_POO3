
public class TitreCommencePar extends Predicat{
	private char lettre;
	
	public TitreCommencePar(char lettre) {
		this.lettre = lettre;
	}
	
	public boolean estVrai(Media m) {
		if(Character.toLowerCase(m.getTitre().charAt(0)) == Character.toLowerCase(lettre)) {
			return true;
		}
		return false;
	}
}
