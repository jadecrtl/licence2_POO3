public class Personne {
    protected String nom ;
    protected int argent;
    protected int pdv;//les points de vie de la personne
    
    public Personne ( String nom, int argent, int pdv ) {
        this.nom = nom ;
        this.argent = argent;
        this.pdv = pdv;
    }
    
    public int getArgent() {
        return argent;
    }

    public void setArgent(int n) {
        this.argent = n;
    }

    public void gain(int n) {
        this.argent += n;
    }

    public boolean perte(int n) {
        if (n <= this.argent) {
            this.argent -= n;
            return true;
        }
        else {
            return false;
        }
    }

    public void blessure(int n) {
        if (n >= this.pdv) {
            pdv = 0;
            System.out.println(this + " est mort.");
        }
        else {
            this.pdv -= n;
        }
    }

    public void attaque (Personne p) {
        p.blessure(0);
    }

    public String toString ( ) {
        return " Je m’appelle " + this.nom + ". J'ai " + this.argent + " unités monétaires, et " + this.pdv + " points de vie.";
    }    

}
