public class Informations {

    private int vitalite;
    private int force;
    private int agilite;

    public Informations (int v, int f, int a) {
        this.vitalite = v;
        this.force = f;
        this.agilite = a;
    }

    public Informations (Informations inf) {
        this.vitalite = inf.vitalite;
        this.force = inf.force;
        this.agilite = inf.agilite;
    }

    public int getVitalite() {
        return vitalite;
    }
    public int getAgilite() {
        return agilite;
    }
    public int getForce() {
        return force;
    }

    public void setVitalite(int vitalite) {
        this.vitalite = vitalite;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public String toString() {
        return "Le perso a " + this.vitalite + " de points de vitalité et a " + this.force + " de points de force et pour finir a " + this.agilite + " de points d'agilité.";
    }





}
