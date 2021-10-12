public class PlanteFleurie extends Plante {

    private static int nbPlanteSansEngrais;
    private boolean engrais = false;

    public PlanteFleurie (int nbPlanteSansEngrais, boolean engrais) {
        super(nbPlanteSansEngrais, engrais);
    }

    public PlanteFleurie() {
        super();
        nbPlanteSansEngrais++;
    }

    public boolean isEngrais() {
        return engrais;
    }

    public void setEngrais(boolean engrais) {
        this.engrais = engrais;
    }

    public static int getNbPlanteSansEngrais() {
        return nbPlanteSansEngrais;
    }

    public static void setNbPlanteSansEngrais(int nbPlanteSansEngrais) {
        PlanteFleurie.nbPlanteSansEngrais = nbPlanteSansEngrais;
    }

    public String toString() {
        return super.toString()+nbPlanteSansEngrais+engrais;
    }

    public int Etat() {
        return nbPlanteSansEngrais;
    }

    public static void arrosage(PlanteFleurie pf) {
        Plante.arrosage(pf);
        if(!pf.engrais) {
            pf.engrais = true;
            nbPlanteSansEngrais--;
        }
    }

}