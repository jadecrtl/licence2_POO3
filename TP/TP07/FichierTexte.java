import java.util.Scanner;

public class FichierTexte extends Element implements Affichable, Editable{
    
    private String contenu = "";

    @Override
    public String getType() {
        return "texte";
    }

    @Override
    public String toString() {
        return "fichier de type " + getType () ;
    }

    @Override
    public void afficher() {
        System.out.println(this.contenu);
    }

    @Override
    public void editer(Scanner sc, boolean echo) {
		String texte = "";
		sc.useDelimiter("\n");//je delimite mes éléments du scanner
        System.out.println("Entrez le texte du fichier (terminez par une ligne contenant seulement un point)");
        while(sc.hasNext()) {//tant que y a des mots dans mon scanner
			String tmp = sc.next();//on prend le premier mot
			if(tmp.equals(".")) {//fin du scanner
				break;
			} else {
				texte += tmp + "\n";//Il va tout réecrire
			}
		}
		this.contenu = texte;
		if(echo) this.afficher();
    }
}
