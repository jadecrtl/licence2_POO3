
public class Ellipse extends Figure implements Deformable{
	private final double grand_rayon;
	private final double petit_rayon;
	
	public Ellipse(int x, int y, double gr, double pr) {
		super(x, y);
		this.grand_rayon = gr;
		this.petit_rayon = pr;
	}

	@Override
	public void affiche() {
		// TODO Auto-generated method stub

	}

	@Override
	public Figure deformation(double coeffH, double coeffV) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double surface() {
		return Math.PI*this.grand_rayon*this.petit_rayon;
	}

}
