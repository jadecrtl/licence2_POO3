
public class exo3 {
	
	public static void affiche(String[] s) {
		for(int i = 0 ; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
	}
	
	public static void init(String[] s) {
		for(int i = 0 ; i < s.length; i++) {
			s[i] = "";
		}
	}
	
	public static String[] Shift(String[] s) {
		char[] voyelles = {'a','e','i','o','u','y'};
		String[] out = new String[s.length];
		String mot ;
		int k;
		
		init(out);
		for(int i =0;i < s.length; i++) {
			//System.out.println(s[i]);
			mot = s[i];
			for(int j=0; j < mot.length(); j++) {
				k=-1;
				do {
					k++;
				}while(k < voyelles.length-1 && voyelles[k] != mot.charAt(j));
				if(voyelles[k] == mot.charAt(j)) {
					out[i] += voyelles[(k+1)%6];
				} else {
					out[i] += mot.charAt(j);
				}
			}
		}
		return out;
	}
	
	public static void main(String[] arg) {
		affiche(Shift(arg));
	}
}
