public class TerminalEmulator {
	public static void main(String[] args) {
		Dossier racine = new Dossier(null);
		Entree e = new EntreeSpeciale(racine,".",new Dossier(racine));
		FichierTexte f = new FichierTexte();
		Entree e1 = new Entree(racine,"fichier",f);
		racine.getL().add(e);
		racine.getL().add(e1);
		Shell s = new Shell(racine);
		s.interagir(System.in);
	}    
}
