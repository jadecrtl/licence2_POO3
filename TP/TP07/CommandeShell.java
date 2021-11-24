import java.util.Scanner;

public abstract class CommandeShell {
	protected Dossier courant;
	protected Dossier racine;
	protected String[] parametres;
	
	public CommandeShell(Dossier d, String[] p) {
		this.courant = d;
		this.racine = d;
		this.parametres = p;
	}
	
	public abstract Dossier executer();
	
	public static void aide() {
		return;
	}
	
	protected static void erreurParam() {
		System.out.println("Pas un bon nombre de paramètres.");
		aide();
	}
	
	protected Entree acceder(String chemin, boolean creer) {
		Scanner sc = new Scanner(chemin);
		sc.useDelimiter("/");
		if(chemin.charAt(0) == '/') {
			return this.racine.getEntree(sc.next(), creer);
		} else {
			return this.courant.getEntree(sc.next(), creer);
		}
	}
}
