import java.util.Random;

public class Societe {
    Personne[] tab;

    public Societe(int n) {
        tab = new Personne[n];
        Random r = new Random();
        for (int j=0; j<tab.length; j++) {
            int i = r.nextInt(5); //i est pris dans {0,1,2}
            Personne a;
            if (i == 0) {
                a = new Noble("Personne_"+j);
            }
            else if (i == 1) {
                a = new Pretre("Personne_"+j);
            }
            else if (i == 2){
                a = new Paysans("Personne_"+j);
            }
            else if (i == 3){
                a = new Artisans("Personne_"+j);
            }
            else {
                a = new Bourgeois("Personne_"+j);
            }
            tab[j] = a;
        }
        
    }

    public int nbPaysans() {
        int compte = 0;
        for (int i=0; i<tab.length; i++) {
            if (tab[i] instanceof Paysans) {
                compte++;
            }
        }
        return compte;
    }

    public int argentTotal() {
        int argentTotal = 0;
        for (int i=0; i<tab.length; i++) {
            if (tab[i] instanceof Roturier) {
                argentTotal += tab[i].getArgent();
            }
        }
        return argentTotal;
    }

}
