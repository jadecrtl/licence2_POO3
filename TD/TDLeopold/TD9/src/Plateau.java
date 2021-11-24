import java.util.List;

public abstract class Plateau {

	private final Case[][] cases;
	private Bateau[] bateaux;
	
	public Plateau(int longueur, int largeur) {
		cases = new Case[longueur][largeur];
		List<Integer> bateauxRestants;
	}
	
	public abstract void placerBateau(int y, int x, int taille, boolean sens);
	public abstract void affiche();
	
}
