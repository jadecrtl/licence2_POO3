public class Chevalier extends Noble{
    
    protected Personne geolier;

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
    
    

    
}
