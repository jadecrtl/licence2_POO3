
public class Media {
	private final String titre;
	private final int numero;
	private static int nbMedia=0;
	
	public Media(String titre) {
		this.titre = titre;
		this.numero = nbMedia;
		nbMedia++;
	}

	public String getTitre() {
		return titre;
	}

	public static int getNbMedia() {
		return nbMedia;
	}
	
	public String toString() {
		return this.numero+" : "+this.titre;
	}
	
	/*public boolean plusPetit(Media doc) {
		if(this.numero < doc.numero) {
			return true;
		}
		return false;
	}*/
	
	public boolean plusPetit(Livre doc) { // A la compilation, l'argument est de type primitif donc
		if(!(this instanceof Livre)) {    // si on crée un objet Media m = new Livre(...) et qu on appelle plusPetit(m)
			return false;                 // cela appelera la fonction plusPetit(Media doc) et non plusPetit(Livre doc)
		}								  
		return this.plusPetit(doc);			
	}
	
	public int ordreMedia() {
		if(this instanceof Livre) {
			return 0;
		}
		if(this instanceof Dictionnaire) {
			return 1;
		}
		return 2;
	}
	
	public boolean plusPetit(Media doc) {
		if(this.ordreMedia() < doc.ordreMedia()) {
			return true;
		}
		if(this.ordreMedia() == doc.ordreMedia()) {
			if(this.numero < doc.numero) {
				return true;
			}
			return false;
		}
		return false;
	}
}
