public class Noble extends Personne{

    public Noble (String nom, int argent, int pdv) {
        super(nom, argent, pdv);
    }

    public String toString() {
        return super.toString()+" Je suis un noble.";
    }

    public boolean donnerArgent(int i) {
        setArgent(getArgent()-i);
        return true;
    }
}
