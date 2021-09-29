public class Personnage {
/*

*/

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
        if (this.etatInitial.getVitalite() > 0) {
            return true;
        }
        return false;
    }

    public void rebirth() {
        this.etatActuel = new Informations(this.etatInitial);
    }



}