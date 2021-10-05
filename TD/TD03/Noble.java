public class Noble extends Personne{

    public Noble (String name) {
        super(name);
    }

    public String toString() {
        return super.toString()+" Je suis un noble.";
    }

    public boolean donnerArgent(int i) {
        super.setArgent(super.getArgent()-i);
        return true;
    }
}
