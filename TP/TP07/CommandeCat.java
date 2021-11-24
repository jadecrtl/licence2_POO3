
public class CommandeCat extends CommandeShell {

	public CommandeCat(Dossier d, String[] p) {
		super(d, p);
	}

	@Override
	public Dossier executer() {
		Entree e = super.acceder(super.parametres[0], false);
		if(super.parametres.length == 1) {
			if(e != null) {
				if(e.getElement() instanceof Dossier) {
					Dossier d = (Dossier)e.getElement();
					d.afficher();
					return null;
				} else {
					FichierTexte f = (FichierTexte) e.getElement();
					f.afficher();
					return null;
				}
			}
		}
		erreurParam();
		return null;
	}
	
	public static void aide() {
		System.out.println("cat <name>");
	}
}
