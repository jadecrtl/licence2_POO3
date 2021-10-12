public class Plante {

    private static int nbPlanteSoif;
    private boolean arrosee = false;

    public Plante(int nbPlanteSoif, boolean arrosee) {
        Plante.nbPlanteSoif = nbPlanteSoif;
        this.arrosee = arrosee;
    }

    public Plante() {
        nbPlanteSoif++;
    }

    public boolean isArrosee() {
        return arrosee;
    }

    public void setArrosee(boolean arrosee) {
        this.arrosee = arrosee;
    }

    public static int getNbPlanteSoif() {
        return nbPlanteSoif;
    }

    public static void setNbPlanteSoif(int nbPlanteSoif) {
        Plante.nbPlanteSoif = nbPlanteSoif;
    }

    public String toString() {
        return "La plante a soif "+Plante.nbPlanteSoif+" fois donc l'arrosage est "+this.arrosee;
    }

    public int Etat() {
        return nbPlanteSoif;
    }

    public static void arrosage(Plante p) {
        if (!p.arrosee) {
            p.arrosee = true;
            nbPlanteSoif--;
        }
    }

}