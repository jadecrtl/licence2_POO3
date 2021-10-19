public class Pretre extends Personne {

    public Pretre (String nom, int argent, int pdv) {
        super(nom, argent, pdv);
    }

    public String toString() {
        return super.toString()+" Je suis un prêtre.";
    }
    
}
