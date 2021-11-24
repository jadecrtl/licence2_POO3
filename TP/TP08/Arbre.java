import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Arbre {

    private Noeud racine;

    public Arbre(String cheminRacine) throws FileNotFoundException{
        this.racine = new Noeud(new File(cheminRacine));
    }

    class Noeud{
        private String nom;
        private int taille;
        private boolean repertoire;
        private ArrayList<Noeud> fils;

        public Noeud(File file)throws FileNotFoundException{
            if(!file.exists()) {
                throw new FileNotFoundException("Le fichier " + file.getName() + " n'existe pas.");
            }
            this.nom = file.getName(); 
            this.taille = (int)file.length();
            this.repertoire = file.isDirectory();
            if (this.repertoire) {
                this.fils = new ArrayList<Noeud>();
                for (File f : file.listFiles()) {
                    this.fils.add(new Noeud(f));
                }
            }
            else {
                this.fils = null;
            }
        }

        public String toString() {
            return this.nom + "[" +this.taille + "]";
        }

        public void affiche() {
            for (Noeud n : this.fils) {
                System.out.println(" " + n);
                if (n.repertoire) {
                    System.out.print(" ");
                    n.affiche();
                }
            }
        }

        public void map(StringTransformation t) {
            if(!this.repertoire) {
                this.nom = t.transf(this.nom);
            } else {
                this.fils.forEach(noeud -> { noeud.nom = t.transf(noeud.nom); });
            }
        }
    
    }

    public void afficher() {
        System.out.println(this.racine);
        this.racine.affiche();
    }

	public void map(StringTransformation t) {
		for(Noeud n : this.racine.fils) {
			n.map(t);
		}
	}

    


}