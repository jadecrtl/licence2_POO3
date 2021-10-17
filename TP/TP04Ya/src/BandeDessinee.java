
public class BandeDessinee extends Livre {
	private String type;
	
	public BandeDessinee(String titre, String auteur, int nbPages, String type) {
		super(titre, auteur, nbPages);
		this.type = type;
	}
	
	public String toString() {
		return super.toString()+" ; "+this.type;
	}
}
