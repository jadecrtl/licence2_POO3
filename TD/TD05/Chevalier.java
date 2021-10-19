public class Chevalier extends Noble{
    
    protected Personne geolier;
    private static final int prixLiberte = 50;

    public Chevalier (String nom, int argent, int pdv) {
        super(nom, argent, pdv);
    }

    public void captureBy (Personne p) {
        geolier = p;
    }

    public void attaque (Personne p) {
        if (p instanceof Chevalier && geolier == null) {
            ((Chevalier)p).captureBy(this);
        }
    }
    
    public boolean acheteLiberte() {
        if (this.getArgent() > Chevalier.prixLiberte) {
            this.geolier.gain(Chevalier.prixLiberte);
            this.perte(Chevalier.prixLiberte);
            this.geolier = null;
            return true;
        }        
        return false;
    }

    
}
