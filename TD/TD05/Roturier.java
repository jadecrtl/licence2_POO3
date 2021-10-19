public class Roturier extends Personne{

    public Roturier (String nom, int argent, int pdv) {
        super(nom, argent, pdv);
    }

    public String toString() {
        return super.toString()+" Je suis un roturier.";
    }
        
}
