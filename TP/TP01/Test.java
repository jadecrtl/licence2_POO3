import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //System.out.println("Le nombre d'arguments mis en paramètres est" + args.length);
        //int[] array = new int[2];
        //Exercice2.affiche(array);

        int[] t1 = {1, 2, 4, 7};
        int[] t2 = {2, 3, 2};
        Exercice2.affiche(Exercice2.multiplication(t1, t2));

        int[] t = {2,12,36,7};
        System.out.println(Arrays.toString(Exercice2.split(t)));


    }
}
