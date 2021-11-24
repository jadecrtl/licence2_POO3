public class Entree {
   
    private Element element ;
    private String nom ;
    private Dossier parent;
    
    public Entree ( Dossier parent , String nom, Element element ) {
        this.element = element;
        this.nom = nom;
        this.parent = parent;
    }

    public Element getElement() {
        return element;
    }

    public String getNom() {
        return nom;
    }

    public Dossier getParent() {
        return parent;
    }

    public String toString() {
        if(this.element != null) {
			return this.nom+" ("+this.element.getType()+")";
		}
		return this.nom+" (entrée vide)";
    }

    public void supprimer() {
		if(this.element instanceof Dossier) {
			this.parent = null;
		}
		this.element = null;
    }

    public void remplacer(Element e) {
		if(e instanceof Dossier) {//si e est bien une sous classe de Dossier
			this.parent = ((Dossier) e).getParent();//On change le type de E en disant que c'est un dossier
			this.element = e;//e devient l'element d'entree du dossier cree au dessus
		}
        else {
		    this.element = e;
		    this.parent = null;
        }
    }

}
