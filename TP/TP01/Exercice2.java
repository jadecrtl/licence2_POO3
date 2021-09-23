class Exercice2 {
    
    public static void affiche(int t[]) {
        for(int i=0; i<t.length; i++) {
            System.out.println(t[i]);
        }
    }
    public static int[] multiplication(int t1[], int t2[]) {
        int[] t3 = null;
        if (t2.length > t1.length) {
            t3 = new int[t2.length];
        }
        else {
            t3 = new int[t1.length];
        }
        for (int i=0; i < t3.length; i++) {
            int a = (i < t1.length) ? t1[i] : 1;
            int b = (i < t2.length) ? t2[i] : 1;
            t3[i] = a * b;
        }
        return t3;    
    }

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



}
