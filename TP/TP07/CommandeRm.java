
public class CommandeRm extends CommandeShell {

	public CommandeRm(Dossier d, String[] p) {
		super(d, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dossier executer() {
		if(super.parametres.length == 1) {
			Entree e = super.acceder(super.parametres[0], false);
			if(e != null && !(e instanceof EntreeSpeciale)) {
				e.supprimer();
				super.courant.getL().remove(e);
				return null;
			} else {
				System.out.println("Ce dossier ou fichier ne peut être supprimé !");
				aide();
				return null;
			}
		}
		aide();
		erreurParam();
		return null;
	}
	
	public static void aide() {
		System.out.println("rm <name>");
	}
	
}
