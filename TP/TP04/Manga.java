public class Manga extends Livre {
	private String genre;
	
	public Manga(String titre, String auteur, int nbPages, String genre) {
		super(titre, auteur, nbPages);
		this.genre = genre;
	}
	
	public String toString() {
		return super.toString()+" ;"+this.genre;
	}
}
