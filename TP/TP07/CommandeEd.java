import java.util.Scanner;

public class CommandeEd extends CommandeShell{
	private Scanner sc;
	private boolean b;
	
	public CommandeEd(Dossier d, String[] p, Scanner sc, boolean b) {
		super(d, p);
		this.sc = sc;
		this.b = b;
	}

	@Override
	public Dossier executer() {
		if(super.parametres.length == 1) {
			if(super.acceder(super.parametres[0], false) instanceof EntreeSpeciale) {
				System.out.println("Ce fichier ne peut être modifié !");
				aide();
				return null;
			}
			if(super.acceder(super.parametres[0], false) != null &&  super.acceder(super.parametres[0], false).getElement() instanceof FichierTexte) {
				FichierTexte f = (FichierTexte) super.acceder(super.parametres[0], false).getElement();
				f.editer(this.sc, this.b);
				return null;
			} else {
				System.out.println("Ce fichier n'existe pas !");
				aide();
				return null;
			}
		}
		aide();
		erreurParam();
		return null;
	}
	
	public static void aide() {
		System.out.println("ed <filename>");
	}

}
