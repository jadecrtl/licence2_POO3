
public class CommandeCd extends CommandeShell {

	public CommandeCd(Dossier d, String[] p) {
		super(d, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Dossier executer() {
		if(super.parametres.length == 0) {
			if(super.courant.getParent() != null) {
				return super.courant.getParent();
			}
			return super.courant;
		}
		if(super.parametres.length == 1) {
			Entree e = super.acceder(super.parametres[0], false);
			if(e != null && e.getElement() instanceof Dossier) {
				super.courant = (Dossier) e.getElement();
				return super.courant;
			}	
		}
		erreurParam();
		return super.courant;
	}
	
	public static void aide() {
		System.out.println("cd [<foldername>]");
	}
}
