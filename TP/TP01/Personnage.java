import java.util.Random;

public class Personnage {

    private String nom;
    private Informations etatInitial;
    private Informations etatActuel;

    public Personnage (String nom, Informations etatInitial, Informations etatActuel) {
        this.nom = nom;
        this.etatInitial = etatInitial;
        this.etatActuel = etatActuel;
    }

    public String toString() {
        return "Je suis " + this.nom;
    }

    public boolean estVivant() {
        if (this.etatActuel.getVitalite() > 0) {
            return true;
        }
        return false;
    }

    public void rebirth() {
        this.etatActuel = new Informations(this.etatInitial);
    }

    public void attaque (Personnage def) {
		Random rd = new Random();
		int n = 1 + rd.nextInt(Math.abs(this.etatActuel.getForce() - def.etatActuel.getForce())-1);
		if(this.etatActuel.getAgilite() > def.etatActuel.getAgilite()) {
			def.etatActuel.setVitalite(def.etatActuel.getVitalite()-n);
		} else {
			def.etatActuel.setVitalite(def.etatActuel.getVitalite()-(n/2));
			def.etatActuel.setAgilite(def.etatActuel.getAgilite()-(1/3)*def.etatActuel.getAgilite());
		}
    }

	public void lutte (Personnage p2) {
		if(p2 == null){
            return;
        }
		this.attaque(p2);
		if(!(this.estVivant())) {
			System.out.println(p2.nom+" est le valinqueur !");
			return;
		}
		p2.lutte(this);
	}


}