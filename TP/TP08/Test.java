import java.io.FileNotFoundException;



public class Test {
    public static void main(String[] args) throws FileNotFoundException{
        Arbre a = new Arbre("/home/jade/Facile");
        a.afficher();
        StringTransformation s = new StringTransformation() {//Interface
            public String transf(String s) {//Instance d'interface = classe anonyme
                return s + ".blah";//En faisant une instance d'interface on peut 
            }//adapter localement toutes les methodes de l'interface
        };
        a.map(s);
        a.afficher();
        System.out.println(s.transf("voiture"));
    }
}
