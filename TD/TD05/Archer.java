public class Archer extends Roturier{

    public Archer (String nom, int argent, int pdv) {
        super(nom, argent, pdv);
    }
    
    public void attaque(Personne p) {
        p.blessure(p.pdv);
    }


}
