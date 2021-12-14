/*
On considere une classe Pseudo qui contient simplement une chaine de caracteres.
On souhaite definir des objets ChangePseudoHistory qui retiendront l'ensemble
des changements qui ont eu lieu sur certains pseudos (anciennes et nouvelles valeurs)
qu'ils observent. Le fonctionnement attendu peut se comprendre sur l'exemple suivant
*/ 
public class Test {
    public static void main(String[] args) {
        //partie declarative 
        Pseudo a = new Pseudo("a");
        Pseudo b = new Pseudo("b");
        Pseudo c = new Pseudo("c");
        Pseudo d = new Pseudo("d");

        ChangePseudoHistory h_ab = new ChangePseudoHistory();
        ChangePseudoHistory h_bc = new ChangePseudoHistory();

        //Pour Exo 2
        //Pseudo<String> a = new Pseudo<>("a");

        a.addObs(h_ab);        
        b.addObs(h_ab);        
        b.addObs(h_bc);        
        c.addObs(h_bc);        

        a.set("a1");
        b.set("b1");
        a.set("a2");
        c.set("c1");
        d.set("d1");
        
        //affichage des historiques observes
        System.out.println(h_ab);
        //h_ab conserve l'historique des modifications de a et b
        System.out.println(h_bc);
        //h_bc conserve l'historique des modifications de b et c

        //Qui doit produire : 
        // a-->a1
        // b-->b1
        // a1-->a2

        //b-->b1
        //c-->c1
    }
}