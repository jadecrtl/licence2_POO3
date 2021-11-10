
public class TabEntiersTriable implements Triable {
	private int[] t;
	
	TabEntiersTriable(int[] t){
		this.t = t;
	}
	
	public String toString() {
		for(int i = 0; i < this.t.length; i++) {
			System.out.print(t[i]+" ");
		}
		return "";
	}
	
	@Override
	public void echange(int i, int j) {
		int tmp = t[i];
		t[i] =t[j];
		t[j] = tmp;
	}

	@Override
	public boolean plusGrand(int i, int j) {
		if(t[i] > t[j]) {
			return true;
		}
		return false;
	}

	@Override
	public int taille() {
		return  t.length;
	}

}
