import java.util.LinkedList;

public class Paragraphe extends ChaineCar{
	LinkedList<ChaineCar> paragraphe;
	
	public Paragraphe() {
		paragraphe=new LinkedList<ChaineCar>();
		
	}
	
	public boolean isEmpty() {
		boolean vide= false;
		if(paragraphe!=null) {
			for(int i = 0 ; i < paragraphe.size(); i++){ 
				if(paragraphe.get(i)==null) vide=true;
			}
		}else {
			vide=true;
		}
		return vide;
	}
	
	public void addChaine(ChaineCar c) {
		if(!isEmpty()) {
			paragraphe.addLast(c);
		}else {
			paragraphe.add(c);
		}
	}
	
	public String toString() {
		String l="";
		for(int i=0;i<paragraphe.size();i++) {
			l=l+paragraphe.get(i).toString();
		}
		return l;
	}

	
}
