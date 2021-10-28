import java.util.LinkedList;
public class Ligne extends ChaineCar {
	LinkedList<ChaineCar> ligne;
	
	public int len() {
		int len=0;
		for(int i = 0 ; i < ligne.size(); i++){
			len =len +ligne.get(i).len();
        }
		return len;
	}
	
	public String toString() {
		String l="";
		for(int i = 0 ; i < ligne.size(); i++){
			l=l+ligne.get(i).toString();
        }
		return l;
	}
	
	public boolean isEmpty() {
		boolean vide= false;
		if(ligne == null) vide=true;
		return vide;
	}
	
	public void addChaine(ChaineCar c) {
		if(isEmpty()) {
			ligne = new LinkedList<ChaineCar>();
			ligne.add(c);
		}else { 
			ligne.addLast(c);
		}
	}

	
}
