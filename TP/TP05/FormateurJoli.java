import java.util.Scanner;
import java.io.File;
import java.util.LinkedList;
public class FormateurJoli extends Formateur {
		Scanner sc;
		LinkedList<Paragraphe>texte;
		int longueur;

		public FormateurJoli(String filename, int longueur) {
	        super(filename);
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
			this.longueur = longueur;

		}

		private Paragraphe readParagraphe(){
			ParagrapheJoli paragrapheJ=new ParagrapheJoli(this.longueur);
			String para = sc.next(); /* on extrait le paragraphe suivant */
			Scanner s = new Scanner(para); /* on initialise un nouveau scanner sur ce paragraphe */ 
			/* s.useDelimiter("\\s+"); pas n ́ecessaire puisque \\s+ est le d ́elimiteur par d ́efaut */
			       while(s.hasNext()){
			        	paragrapheJ.addChaine(new Mot(s.next()));
			        	paragrapheJ.addChaine(new Espace());
					}
			       return paragrapheJ;
		}
		
		
		public void read(){
			sc.useDelimiter("\n\\s*\n");
			while(sc.hasNext()){ /* tant qu’il reste un paragraphe a lire */
				Paragraphe p = readParagraphe();
			        texte.add(p);
			    }
		}
		
		public void print(){
			Espace e=new Espace();
			for(int i=0;i<texte.size()-1;i++) {
			    System.out.print(e.toString2());
				System.out.println(texte.get(i).toString());
				System.out.println();
			}
		    System.out.print(e.toString2());
			System.out.println(texte.get(texte.size()-1));
		}
		
}
