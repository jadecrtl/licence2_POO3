public class Exercice2 {

    public static void affiche(int[] t) {
        for (int i = 0; i<t.length; i++) {
            System.out.print(t[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void afficheS(String[] t) {
        for (int i=0; i<t.length; i++) {
            System.out.print(t[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static int[] multiplication(int[] t1, int[] t2) {
        int[] t3 = null;
        if (t2.length > t1.length) {
            t3 = new int[t2.length];
        }
        else {
            t3 = new int[t1.length];
        }
        for (int i=0; i<t3.length; i++) {
            int a = (i < t1.length) ? t1[i] : 1;
            int b = (i < t2.length) ? t2[i] : 1;
            t3[i] = a * b;
        }
        return t3;
    }

    // String.valueOf(n): transforme l’entier n en une chaîne de caractères
    // Character.getNumericValue(c): retransforme le charactère c en une valeur numérique

    //prend en entrée un tableau d’entiers t et retourne le tableau obtenu en séparant chacun des chiffres.
    //exemple: Si t={2,12,36,7} il faut retourner t={2,1,2,3,6,7}
    public static int[] split(int[] t) {
        String c = "";
        int a = 0;
        for (int i=0; i<t.length; i++) {
            String b = String.valueOf(t[i]);
            a += b.length();
            c += String.valueOf(t[i]);
        }
        int[] t2 = new int[a];
        for (int j=0; j<t2.length; j++) {
            t2[j] = Character.getNumericValue(c.charAt(j));
        }
        return t2;
    }



    public static void main(String[] args) {
        int[] tab = {0,1,2,3};
        affiche(tab);//doit retourner 0 1 2 3
        int[] tab1 = {2,3,4};
        int[] tab2 = {3,3,3,3};
        affiche(multiplication(tab1, tab2));//doit retourner 6 9 12 3
        int[] tab3 = {2,12,36,7};
        affiche(split(tab3));//doit retourner 2 1 2 3 6 7
        String[] tab4 = {"il ", "fait ", "beau ", "aujourd hui", "j y ", "vais"};
        //doit afficher ol feot biey eyjuyrd hyo j a veos
        String[] tab5 = Exercice3.Shift(tab4);
        afficheS(tab5);
    }

}