
public class Dictionnaire extends Media {
	private String langue;
	private int nbTomes;
	
	public Dictionnaire(String titre, String langue, int nbTomes) {
		super(titre);
		this.langue = langue;
		this.nbTomes = nbTomes;
	}
	
	public String toString() {
		return super.toString()+"; "+this.nbTomes+"; "+this.langue;
	}
}
