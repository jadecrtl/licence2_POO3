
public class CommandeMv extends CommandeShell {

	public CommandeMv(Dossier d, String[] p) {
		super(d, p);
	}

	@Override
	public Dossier executer() {
		if(super.parametres.length == 2) {
			Entree e = super.acceder(super.parametres[0], false);
			Entree e1 = super.acceder(super.parametres[1], false);
			if(e == null || e1 == null) {
				System.out.println("Ces dossiers ou fichiers n'existent pas !");
				return null;
			}
			if(e1.getElement() instanceof Dossier) {
				Dossier d = (Dossier) e1.getElement();
				if(e instanceof EntreeSpeciale || e1 instanceof EntreeSpeciale) {
					System.out.println("Cet élément ne peut être modifié !");
					return null;
				}
				if(e.getElement() instanceof Dossier) {
					if(d.estEnfantDe((Dossier) e.getElement()) || e1 == e){
						System.out.println("Pas possible de déplacer un dossier dans lui-même !");
						return null;
					}
				}
				if(d.getEntree(super.parametres[0], false) == null) {
					d.getL().add(e);
					super.courant.getL().remove(e);
					return null;
				} else {
					System.out.println("Un fichier ou dossier de ce nom existe deja !");
					return null;
				}
			}
		}
		aide();
		erreurParam();
		return null;
	}
	
	public static void aide() {
		System.out.println("mv <src> <dst>");
	}

}
