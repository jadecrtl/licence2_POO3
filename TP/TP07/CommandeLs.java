
public class CommandeLs extends CommandeShell {

	public CommandeLs(Dossier d, String[] p) {
		super(d, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dossier executer() {
		if(super.parametres.length == 0) {
			super.courant.afficher();
			return null;
		}
		if(super.parametres.length == 1) {
			Entree e = super.acceder(super.parametres[0], false);
			if(e != null && e.getElement() instanceof Dossier) {
				Dossier d = (Dossier) e.getElement();
				d.afficher();
				return null;
			} else {
				System.out.println("Ce dossier ou fichier n'existe pas !");
				erreurParam();
				return null;
			}
		}
		aide();
		erreurParam();
		return null;
	}
	
	public static void aide() {
		System.out.println("ls [<name>]");
	}

}
