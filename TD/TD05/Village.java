import java.util.LinkedList;

public class Village {
    
    protected LinkedList<Roturier> roturier;

    public Village() {
        this.roturier = new LinkedList<Roturier>();
    }

    public int volArgent() {
        int somme = 0;
        for (Personne x : roturier) {
            somme += x.getArgent()/2;
            x.perte(x.getArgent()/2);
        }
        return somme;
    }



}