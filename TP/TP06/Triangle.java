
public class Triangle extends Figure implements Deformable{
	private double base;
	private double hauteur;
	
	public Triangle(int x, int y, int b, int h) {
		super(x, y);
		this.base = b;
		this.hauteur = h;
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
		return (this.base*this.hauteur)/2;
	}

}
