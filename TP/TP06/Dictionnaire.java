
public class Dictionnaire implements Triable{
	private String[] str;
	
	public Dictionnaire(String[] s) {
		this.str = s;
	}
	
	public String toString() {
		for(int i = 0; i < this.str.length; i++) {
			System.out.print(str[i]+" ");
		}
		return "";
	}
	
	@Override
	public void echange(int i, int j) {
		String tmp = str[i];
		str[i] =str[j];
		str[j] = tmp;
	}

	@Override
	public boolean plusGrand(int i, int j) {
		return str[i].compareTo(str[j]) > 0;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return this.str.length;
	}

}
