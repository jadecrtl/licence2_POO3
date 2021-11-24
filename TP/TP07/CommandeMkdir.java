
public class CommandeMkdir extends CommandeShell {

	public CommandeMkdir(Dossier d, String[] p) {
		super(d, p);
	}

	@Override
	public Dossier executer() {
		if(super.parametres.length != 1) {
			erreurParam();
			return null;
		}
		if(super.courant.getEntree(super.parametres[0], false) == null) {
			Dossier d = new Dossier(super.courant);
			Entree e = new Entree(super.courant, super.parametres[0], d);
			Entree e1 = new EntreeSpeciale(d, ".", new Dossier(d));
			Entree e2 = new EntreeSpeciale(d, "..", new Dossier(d));
			d.getL().add(e1);
			d.getL().add(e2);
			super.courant.getL().add(e);
			return null;
		}
		System.out.println("Un dossier ou fichier de ce nom existe deja !");
		return null;
	}
	
	public static void aide() {
		System.out.println("mkdir <foldername>");
	}
}
