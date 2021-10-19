import java.util.LinkedList;

public class Condottiere extends Personne{
    
    protected LinkedList<Archer> archers;
    protected LinkedList<Fantassin> fantassins;

    public Condottiere (String nom, int argent, int pdv) {
        super(nom, argent, pdv);
        this.archers = new LinkedList<Archer>();
        this.fantassins = new LinkedList<Fantassin>();
    }

    public void attaque(Village v) {
        int somme = v.volArgent();
        this.argent += somme/2;
        int nbSoldats = archers.size()+fantassins.size();
        int partager = somme/2/nbSoldats;
        for (Archer archer : this.archers) {
            archer.gain(partager);
        }
        for (Fantassin fantassin : this.fantassins) {
            fantassin.gain(partager);
        }
    }



}
