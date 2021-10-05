import java.util.Scanner;

public class Joueur {
	private String nom;
	private Scanner scanReponse;
	
	public Joueur() {
		this.nom = "Anonyme";
		this.scanReponse = new Scanner(System.in);
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void finish() {
		this.scanReponse.close();
	}
	
	public boolean veutJouer() {
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
	
	public String demanderNom() {
		System.out.println("Quel est votre nom ?");
		String nom = this.scanReponse.next();
		return nom;
	}
	
	public int[] demanderDimensions() {
		int[] res = new int[2];
		System.out.println("Quelles dimensions voulez-vous pour votre plateau (hauteur) ?");
		int hauteur = this.scanReponse.nextInt();
		System.out.println("Quelles dimensions voulez-vous pour votre plateau (largeur) ?");
		int largeur = this.scanReponse.nextInt();
		res[0] = hauteur; res[1] = largeur;
		return res;
	}
	
	public int demanderNbMines() {
		System.out.println("Combien de mines voulez-vous ?");
		int mines = this.scanReponse.nextInt();
		return mines;
	}
	
	public char demanderAction() {
		System.out.println("Voulez-vous reveler une case (r) ou placer un drapeau (d) ?");
		String reponse = this.scanReponse.next();
		if(reponse.charAt(0) != 'r') {
			if(reponse.charAt(0) != 'd') {
				return this.demanderAction();
			}
			return reponse.charAt(0);
		}
		return reponse.charAt(0);
	}
	
	public int[] demanderCoordonnes() {
		char[] abc = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int[] res = new int[2];
		System.out.println("Entrez les coordonnées de la case à relevée (sous la forme 'B6') ?");
		String coordonnes = this.scanReponse.next();
		for(int i = 0; i < abc.length; i++) {
			if(coordonnes.charAt(0) == abc[i]) {
				res[0] = i+1;
			}
		}
		if(res[0] == 0) {
			return this.demanderCoordonnes();
		}
		res[1] = Character.getNumericValue(coordonnes.charAt(1));
		return res;
	}
}
