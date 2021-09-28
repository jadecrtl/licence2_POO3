public class Horloge {
    CompteurCyclique heure;
    CompteurCyclique minute;

    public Horloge (int h, int m) {
        heure = new CompteurCyclique(24, h);
        minute = new CompteurCyclique(60, m);
    }

    public void setHeure (int h) {
        heure = new CompteurCyclique(24, h);
    }

    public void TicTac() {
        if (minute)
    }
}
