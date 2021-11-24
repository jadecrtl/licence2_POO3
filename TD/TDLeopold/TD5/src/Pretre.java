public class Pretre extends Personne {

    public Pretre (String name, int argent, int pdv) {
        super(name, argent, pdv);
    }

    public String toString() {
        return super.toString()+" Je suis un prêtre.";
    }
    
}
