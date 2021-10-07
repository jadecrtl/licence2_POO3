import java.util.Scanner;

public class Joueur {
    
    private String nom;
    private Scanner scanReponse;

    public Joueur(){
        this.nom = "Anonyme";
        this.scanReponse = new Scanner(System.in);
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void finish(){
        this.scanReponse.close();
    }

    public boolean veutJouer(){
		System.out.println("Voulez-vous jouer (oui/non) ?");
		String jouer = this.scanReponse.next();
		if(jouer.equals("oui")) {
			return true;
		}
		if(jouer.equals("non")) {
			return false;
		}
		return this.veutJouer();
    }

    public String demanderNom(){
        System.out.println("Quel est votre prénom?");
        String name = this.scanReponse.next();
        return name;
    }

    public int[] demanderDimensions(){
        int[] res = new int[2];
        System.out.println("Quelle dimensions souhaitez-vous pour la hauteur?");
        int hauteur = this.scanReponse.nextInt();
        System.out.println("Quelle dimensions souhaitez-vous pour largeur?");
        int largeur = this.scanReponse.nextInt();
        res[0] = hauteur;
        res[1] = largeur;
        return res;
    }

    public int demanderNbMines(){
        System.out.println("Combien de mines souhaitez-vous?");
        int nbMines = this.scanReponse.nextInt();
        return nbMines;
    }

    public char demanderAction(){
		System.out.println("Voulez-vous reveler une case (r) ou placer un drapeau (d) ?");
        String reponse = this.scanReponse.next();
        if (reponse.charAt(0) != 'r') {
			if(reponse.charAt(0) != 'd') {
				return this.demanderAction();
			}
			return reponse.charAt(0);
        }
        return reponse.charAt(0);
    }

    public int[] demanderCoordonnes(){
		char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int[] res = new int[2];
		System.out.println("Entrez les coordonnées de la case à relevée (sous la forme 'B6') ?");
		String coordonnes = this.scanReponse.next();
		for(int i = 0; i < alpha.length; i++) {
			if(coordonnes.charAt(0) == alpha[i]) {//est ce que le 1er caractère de ce qui a été écrit est dans le tableau de char alpha
				res[0] = i+1;
			}
		}
		if(res[0] == 0) {//Si res[0] = 0 ça veut dire que ce qui a été écrit ne correspond pas aux lettres du tableau de char alpha
			return this.demanderCoordonnes();
		}
		res[1] = Character.getNumericValue(coordonnes.charAt(1));//transformer le 2eme caractère en nombre
		return res;
    }




}
