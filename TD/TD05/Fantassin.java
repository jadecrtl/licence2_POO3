public class Fantassin extends Roturier{

    private int degats;//indique le nombre des points de vie à retirer lors d'une attaque
    
    public Fantassin (String nom, int argent, int pdv, int degats) {
        super(nom, argent, pdv);
        this.setDegats(degats);
    }

    public int getDegats() {
        return degats;
    }

    public void setDegats(int degats) {
        this.degats = degats;
    }
    
    public void attaque(Personne p) {
        p.blessure(0);
    }



}
