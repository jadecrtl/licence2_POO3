import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Shell {
	private Dossier racine;
	private Dossier courant;
	
	public Shell(Dossier d) {
		this.racine = d;
		this.courant = d;
	}
	
	public static void help() {
		System.out.println("cat <name>\n"
				+ "cd [<foldername>]\n"
				+ "cp <src> <dst>\n"
				+ "ed <filename>\n"
				+ "ls [<name>]\n"
				+ "mkdir <foldername>\n"
				+ "mv <src> <dst>\n"
				+ "rm <name>\n"
				+ "quit\n"
				+ "help");
	} 
	
	public String[] listToArray(LinkedList<String> l) {
		String[] str = new String[l.size()];
		if(l.size() != 0) {
			int i = 0;
			for(String s: l) {
				str[i] = s;
				i++;
			}
		}
		return str;
	}
	
	public void interagir(InputStream in) {
		boolean change = true;
		while(change) {
			Scanner sc1 = new Scanner(in).useDelimiter("\n");
			if(sc1.hasNext()) {
				Scanner sc2 = new Scanner(sc1.next()).useDelimiter("\\s");
				LinkedList<String> l = new LinkedList<String>();
				if(sc2.hasNext()) {
					String tmp2 = sc2.next();
					if(tmp2.equals("help")) {
						if(sc2.hasNext()) {
							System.out.println("Cette commande n'a pas d'argument !");
						} else {
							help();
						}	
					}
					if(tmp2.equals("quit")) {
						if(sc2.hasNext()) {
							System.out.println("Cette commande n'a pas d'argument !");
						} else {
							change = false;
						}	
					}
					if(tmp2.equals("rm")) {
						while(sc2.hasNext()) {
							l.add(sc2.next());
						}
						CommandeRm c = new CommandeRm(this.courant, this.listToArray(l));
						c.executer();
					}
					if(tmp2.equals("cat")) {
						while(sc2.hasNext()) {
							l.add(sc2.next());
						}
						CommandeCat c = new CommandeCat(this.courant, this.listToArray(l));
						c.executer();
					}
					if(tmp2.equals("ls")) {
						while(sc2.hasNext()) {
							l.add(sc2.next());
						}
						CommandeLs c = new CommandeLs(this.courant, this.listToArray(l));
						c.executer();
					}
					if(tmp2.equals("ed")) {
						while(sc2.hasNext()) {
							l.add(sc2.next());
						}
						CommandeEd c = new CommandeEd(this.courant, this.listToArray(l), new Scanner(System.in),(in != System.in));
						c.executer();
					}
					if(tmp2.equals("cd")) {
						while(sc2.hasNext()) {
							l.add(sc2.next());
						}
						CommandeCd c = new CommandeCd(this.courant, this.listToArray(l));
						this.courant = c.executer();
					}
					if(tmp2.equals("mv")) {
						while(sc2.hasNext()) {
							l.add(sc2.next());
						}
						CommandeMv c = new CommandeMv(this.courant, this.listToArray(l));
						c.executer();
					}
					if(tmp2.equals("mkdir")) {
						while(sc2.hasNext()) {
							l.add(sc2.next());
						}
						CommandeMkdir c = new CommandeMkdir(this.courant, this.listToArray(l));
						c.executer();
					}
				}	
			}
		}
	}
}
