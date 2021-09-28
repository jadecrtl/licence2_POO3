public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private int monnaie;
    
    public Personne(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.monnaie = 0;
    }
    
    public int getMonnaie() {
        return this.monnaie;
    }

    public void setPrenom(String p){
        this.prenom = p;
    }

    public void setNom(String n) {
        this.nom = n;
    }
    
    public void anniversaire(){
        this.age ++;
    }
    public String toString(){
        return "Je m’appelle : " + this.prenom + " " + this.nom + ". J’ai " + this.age + " ans et j'ai " + this.monnaie + " centimes.";
    }

    public void ajouter (int m) {
        if (m > 0) {
            this.monnaie += m;
        }
        else {
            System.out.println("On ne peut pas avoir un nombre négatif de centimes.");
        }
    }

    public void soustraire (int m) {
        if (getMonnaie() < m) {
            System.out.println("On ne peut pas me soustraire plus que je n'ai déjà.");
        }
        else {
            this.monnaie -= m;
        }
    }

    public static boolean donne (Personne p1, Personne p2, int montant) {
        if (montant > p1.getMonnaie()) {
            return false;
        }
        else {
            p2.ajouter(montant);
            p1.soustraire(montant);
            return true;
        }
    }

    public boolean donne(Personne p, int montant){ 
        if (montant > this.getMonnaie()) {
            return false;
        }
        else {
            p.ajouter(montant);
            this.soustraire(montant);
            return true;
        }
    }    
}