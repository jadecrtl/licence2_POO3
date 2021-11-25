import java.util.ArrayList;
import java.util.Iterator;
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
        private File file;

        public Noeud(File file)throws FileNotFoundException{
            if(!file.exists()) {
                throw new FileNotFoundException("Le fichier " + file.getName() + " n'existe pas.");
            }
            this.file = file;
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

        public void traverser(String extension) {
            for (Noeud n : this.fils) {
                if (n.repertoire) {
                    n.traverser(extension);
                }
                else {
                    if (n.nom.endsWith(extension)) {
                        System.out.println(n);
                    }
                }
            }
        }

        public void supprimer(String extension) throws UnableToDeleteFileException{
            Iterator t = this.fils.iterator();
            while(t.hasNext()) {
                Noeud n = (Arbre.Noeud) t.next();
                if (n.repertoire) {
                    n.supprimer(extension);
                }
                else {
                    if (n.nom.endsWith(extension)) {
                        if (!n.file.getParentFile().canWrite()) {
                            throw new UnableToDeleteFileException("Le fichier ne peut pas etre supprime!");
                        }
                        else {
                            t.remove();
                        }
                    }
                }
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

    public void traverser(String extension) {
        this.racine.traverser(extension);
    }

    public void supprimer(String extension) {
        try {
            this.racine.supprimer(extension);
        }
        catch(UnableToDeleteFileException e){
            e.printStackTrace();
        }
    }


}