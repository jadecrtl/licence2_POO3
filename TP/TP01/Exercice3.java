public class Exercice3 {
    
    public static void affiche (String[] t) {
        for (int i=0; i<t.length; i++) {
            System.out.println(t[i] + " ");
        }
    }

    public static void reset (String[] t) {
        for (int i=0; i<t.length; i++) {
            t[i] = "";
        }
    }

    public static String[] Shift (String[] t) {
        char[] c1 = {'a', 'e', 'i', 'o', 'u', 'y'};
        String[] t2 = new String [t.length];
        String mot ;
		int k;
		reset(t2);
        
		for(int i =0;i < t.length; i++) {
			mot = t[i];
			for(int j=0; j < mot.length(); j++) {
				k=-1;
				do {
					k++;
				}
                while(k < c1.length-1 && c1[k] != mot.charAt(j));
				    if(c1[k] == mot.charAt(j)) {
					    t2[i] += c1[(k+1)%6];
				    }
                    else {
					    t2[i] += mot.charAt(j);
				    }
			}
		}
		return t2;        
    }



}
