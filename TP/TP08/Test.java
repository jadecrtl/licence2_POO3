import java.io.FileNotFoundException;



public class Test {
    public static void main(String[] args) throws FileNotFoundException{
        Arbre a = new Arbre("/home/jade/Facile");
        Arbre b = new Arbre("/home/jade/Facile");
        a.afficher();
        System.out.println("**************");

        StringTransformation s = new StringTransformation() {//Interface
            public String transf(String s) {//Instance d'interface = classe anonyme
                return s + ".blah";//En faisant une instance d'interface on peut 
            }//adapter localement toutes les methodes de l'interface
        };

        System.out.println("**************");
        a.map(s);
        System.out.println("**************");
        a.afficher();
        System.out.println("**************");
        System.out.println(s.transf("voiture"));
        System.out.println("**************");
        b.traverser(".txt");
        System.out.println("**************");
        b.afficher();
        System.out.println("**************");
        b.supprimer(".txt");
        b.afficher();
    }
}
