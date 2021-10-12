public class Deplacement {
    private int x0;
	private int y0;
	private int x1;
	private int y1;
	
	public Deplacement(int x0, int y0, int x1, int y1) {
		this.x0 = x0;
		this.x1 = x1;
		this.y0 = y0;
		this.y1 = y1;
	}
	
	public int getX0() {
		return this.x0;
	}
	
	public int getY0() {
		return this.y0;
	}
	
	public int getX1() {
		return this.x1;
	}
	
	public int getY1() {
		return this.y1;
	}
	
	public char typeDeplacement() {
		if(x0 == x1 && y0 != y1) {
			return 'h';
		}
		if(x0 != x1 && y0 == y1) {
			return 'v';
		}
		if(x1-x0 == y1-y0 || x1-x0 == y0-y1 || x0-x1 == y1-y0 || x0-x1 == y0-y1) {
			return 'd';
		}
		if(x1-x0+2 == y1-y0-1 || x1-x0+2 == y1-y0+1 || x1-x0+1 == y1-y0-2 || x1-x0+1 == y1-y0+2 || x1+x0+2 == y1-y0-1 || x1+x0+2 == y1-y0+1 || x1+x0+1 == y1-y0+2 || x1+x0+1 == y1-y0-2) {
			return 'c';
		}
		return 'x';
	}
	
	public int dist() {
		if(this.typeDeplacement() == 'h' || this.typeDeplacement() == 'd' || this.typeDeplacement() == 'v') {
			return (int) Math.sqrt(Math.pow(x1-x0, 2)+Math.pow(y1-y0,2));
		}
		return -1;
	}

}
