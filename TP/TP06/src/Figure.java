
public abstract class Figure implements Deformable{
	private int posX;
	private int posY;
	
	public Figure(int x, int y) {
		this.posX = x;
		this.posY = y;
	}
	
	public final int getPosX() {
		return this.posX;
	}
	
	public final int getPosY() {
		return this.posY;
	}
	
	public abstract void affiche();
	
	public double estDistantde(Figure fig) {
		return Math.sqrt(Math.pow(fig.posX-this.posX,2)+Math.pow(fig.posY-this.posY,2));
	}
	
	public abstract double surface();
	
	public void deplacement(int x, int y) {
		this.posX = x;
		this.posY = y;
	}
}
