import java.util.Random;

public class Personnage {
	private String nom;
	private Information etatInit;
	private Information etatAct;
	
	public Personnage(String nom, Information etat1, Information etat2) {
		this.nom = nom;
		this.etatInit = etat1;
		this.etatAct = etat2;
	}
	
	public String toString() {
		return "Je suis "+nom;
	}
	
	boolean estVivant() {
		if(this.etatAct.getVitalite() > 0) {
			return true;
		}
		return false;
	}
	
	void rebirth() {
		this.etatAct = new Information(etatInit);
	}
	
	void attaque(Personnage def) {
		Random rd = new Random();
		int n = 1+rd.nextInt(Math.abs(this.etatAct.getForce()-def.etatAct.getForce())-1);
		if(this.etatAct.getAgilite() > def.etatAct.getAgilite()) {
			def.etatAct.setVitalite(def.etatAct.getVitalite()-n);
		} else {
			def.etatAct.setVitalite(def.etatAct.getVitalite()-(n/2));
			def.etatAct.setAgilite(def.etatAct.getAgilite()-(1/3)*def.etatAct.getAgilite());
		}
	}
	
	void lutte(Personnage p2) {
		if(p2 == null)return;
		this.attaque(p2);
		if(!(this.estVivant())) {
			System.out.println(p2.nom+" est le valinqueur !");
			return;
		}
		p2.lutte(this);
	}
}
