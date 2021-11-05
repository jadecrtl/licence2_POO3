
public class Rectangle extends Figure implements Deformable{
	private final double largeur;
	private final double longueur;
	
	public Rectangle(int x, int y, double lon, double lar) {
		super(x, y);
		this.largeur = lar;
		this.longueur = lon;
	}
	
	@Override
	public void affiche() {

	}

	@Override
	public Figure deformation(double coeffH, double coeffV) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double surface() {
		return this.largeur*this.longueur;
	}

}
