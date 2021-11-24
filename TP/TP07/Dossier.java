import java.util.LinkedList;

public class Dossier extends Element implements Affichable{
    
    private Dossier parent;
    private LinkedList<Entree> entrees;

    public Dossier(Dossier parent) {
        this.parent = parent;
        entrees = new LinkedList<Entree>();
    }

    public Dossier getParent() {
        return parent;
    }

    @Override
    public void afficher() {
        if (this.entrees.size() != 0) {
            for (int i=0; i<entrees.size(); i++) {
                System.out.print(entrees.get(i)+"\n");
            }
        }
        else {
            System.out.println("Pas d'éléments dans la liste");
        }
    }

    @Override
    public String getType() {
        return "Dossier";
    }

    public Entree getEntree(String nom, boolean creer) {
        for (int i=0; i<entrees.size(); i++) {
            if (entrees.get(i).getNom() == nom) {
                return entrees.get(i);
            }
        }
		if(creer) {
			Entree res = new Entree(null,nom,null);
			this.entrees.add(res);
			return res;
		}
        return null;
    }

	public boolean estEnfantDe(Dossier o) {
		if(this.parent == o) {
			return true;
		}
		return false;
	}

    public LinkedList<Entree> getL() {
        return entrees;
    }


}
