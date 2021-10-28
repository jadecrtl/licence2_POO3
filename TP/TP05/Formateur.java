import java.util.Scanner;
import java.io.File;
import java.util.LinkedList;
public class Formateur {
	Scanner sc;
	LinkedList<Paragraphe>texte;
	
	//fic est le nom du fichier,
	//chemin compris s’il n’est pas dans le même répertoire
	public Formateur(String filename) {
	    sc = null;
	    try {
	        sc = new Scanner(new File(filename));
	    }
	    catch(Exception e) {
	        System.out.println("Erreur lors d’ouverture fichier:");
	        e.printStackTrace();
	        System.exit(1);
		}
	    texte = new LinkedList<Paragraphe>();

	}
	
	private Paragraphe readParagraphe(){
		Paragraphe paragraphe=new Paragraphe();
		String para = sc.next(); /* on extrait le paragraphe suivant */
		Scanner s = new Scanner(para); /* on initialise un nouveau scanner sur ce paragraphe */ /* s.useDelimiter("\\s+"); pas n'ecessaire puisque \\s+ est le d'elimiteur par défaut */
		       while(s.hasNext()){
		        	paragraphe.addChaine(new Mot(s.next()));
		        	paragraphe.addChaine(new Espace());
				}
		       return paragraphe;
	}
	
	
	public void read(){
		sc.useDelimiter("\n\\s*\n");
		while(sc.hasNext()){ /* tant qu’il reste un paragraphe `a lire */
			Paragraphe p = readParagraphe();
		        texte.add(p);
		    }
	}
	
	public void print(){
		for(int i=0;i<texte.size()-1;i++) {
			System.out.println(texte.get(i).toString());
			System.out.println();
		}
		System.out.println(texte.get(texte.size()-1));
	}
		
}
