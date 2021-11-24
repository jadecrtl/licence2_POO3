import java.io.*;
import java.util.*;

public class Arbre {
	private Noeud racine;
	
	public Arbre(String fileName){
		File f = new File(fileName);
		try {
			this.racine = new Noeud(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public void affiche() {
		System.out.println(this.racine);
		this.racine.afficher();
	}
	
	public void map(StringTransformation t) {
		for(Noeud n : this.racine.fils) {
			if(n.repertoire) {
				n.map(t);
			} else {
				n.map(t);
			}	
		}
	}
	
	void traverser(String extension) {
		this.racine.traverser(extension);
	}
	
	void supprimer(String extension){
		try {
			this.racine.supprimer(extension);
		} catch (UnableToDeleteFileException e) {
			e.printStackTrace();
		}
	}
	
	class Noeud{
		private String nom;
		private int taille;
		private boolean repertoire;
		private ArrayList<Noeud> fils;
		private File fichier;
		
		public Noeud(File fichier) throws FileNotFoundException{
			if(!fichier.exists()) {
				throw new FileNotFoundException("Le fichier "+fichier.getName()+ " n'existe pas !");
			}
			this.fichier = fichier;
			this.nom = fichier.getName();
			this.taille = (int) fichier.length();
			this.repertoire = fichier.isDirectory();
			if(this.repertoire) {
				this.fils = new ArrayList<Noeud>();
				for(File f : fichier.listFiles()) {
					this.fils.add(new Noeud(f));
				}
			} else {
				this.fils = null;
			}
		}
		
		public void afficher() {
			for(Noeud n: this.fils) {
				System.out.println(" "+n);
				if(n.repertoire) {
					System.out.print(" ");
					n.afficher();
				}
			}
		}
		
		public String toString() {
			
			return this.nom+" "+"["+this.taille+"]";
		}
		
		public void map(StringTransformation t) {
			if(!this.repertoire) {
				this.nom = t.transf(this.nom);
			} else {
				this.fils.forEach(noeud -> {
					noeud.nom = t.transf(noeud.nom);
				});
			}
		}
		
		void traverser(String extension) {
			for(Noeud n : this.fils) {
				if(n.repertoire) {
					n.traverser(extension);
				} else {
					if(n.nom.endsWith(extension)) {
						System.out.println(n);
					}
				}
			}
		}
		
		void supprimer(String extension) throws UnableToDeleteFileException {
			Iterator t = this.fils.iterator();
			while(t.hasNext()) {
				Noeud n = (Arbre.Noeud) t.next();
				if(n.repertoire) {
					n.supprimer(extension);
				} else {
					if(n.nom.endsWith(extension)) {
						if(!n.fichier.getParentFile().canWrite()) {
							throw new UnableToDeleteFileException("Le fichier ne peut être supprimé !");
						} else {
							t.remove();
						}
					}
				}
			}
		}
	}
}
