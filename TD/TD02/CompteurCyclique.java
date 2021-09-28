public class CompteurCyclique {
    private int valeur;
    private final int max;

    /*public CompteurCyclique (int max) {
        this.max = max;
        this.valeur = 0;
    }*/

    public CompteurCyclique (int max, int valeur) {
        this.max = max;
        this.valeur = valeur;
    }

    public CompteurCyclique (int max) {
        this(max, 0);
    }    

    public void reinitialiser() {
        valeur = 0;
    }

    public boolean incrementer() {
        boolean rent = false;
        valeur++;
        if (valeur == max) {
            reinitialiser();
            rent = true;
        }
        return rent;
    }


}
