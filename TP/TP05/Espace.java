import java.util.Arrays;
public class Espace extends ChaineCar{
	String espace; //taille de la tabulation = 3
	private int size=2;
	
	public Espace() {
		this.espace=" ";
	}
	
	
	public int len() {
		return this.size;
	}
	
	public String toString() {
		String l=" ";
		return l;
	}
	
	public String toString2() {
		char[] array = new char[this.size];
		Arrays.fill(array,' ');
		return new String(array);
	}

	public void setSize(int size) {
		this.size=size;
	}

}
