public class Livre extends Media {
	private String auteur;
	private int nbPages;
	
	public Livre(String titre, String auteur, int nbPages) {
		super(titre);
		this.auteur = auteur;
		this.nbPages = nbPages;
	}
	
	public String toString() {
		return super.toString()+"; "+this.auteur+"; "+this.nbPages;
	}
	
	/*@Override
	public boolean plusPetit(Media e) { //fonctionne que si l'instance courante est de type Livre
		if(!(e instanceof Livre)) {
			return true;
		}
		return super.plusPetit(e);
	}*/
}
