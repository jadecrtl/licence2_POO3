
public class exo2 {
	public static void affiche(int[] t) {
		for(int i=0 ; i < t.length; i++) {
			System.out.println(t[i]);
		}
	}
	
	public static int[] multiplication(int[] t1, int[] t2) {
		if(t1.length > t2.length) {
			int[] t3 = new int[t1.length];
			for(int i : t1) {
				if(i > t2.length-1) {
					t3[i] = 1;
				} else {
					t3[i] = t1[i]*t2[i];
				}
			}
			return t3;
		} else {
			int[] t3 = new int[t2.length];
			for(int i : t2) {
				if(i > t1.length-1) {
					t3[i] = 1;
				} else {
					t3[i] = t1[i]*t2[i];
				}
			}
			return t3;
		}
	}
	
	public static int lengthForSplit(int[] t) {
		int res = 0;
		for(int i = 0; i < t.length;i++) {
			res+= Math.floor(Math.log10(t[i]))+1;
		}
		return res;
	}
	
	public static int[] split(int t[]) {
		int j = 0;
		int length = lengthForSplit(t); 
		int [] res = new int[length];
		for(int i = 0; i < t.length; i++) {
			String r = String.valueOf(t[i]);
			int k = 0;
			while(k < r.length()) {
				res[j] = Character.getNumericValue(r.charAt(k));
				k++;
				j++;
			}
		}
		return res;
	}
	
	public static void main(String[] arg) {
		int[] t = {10,254,5,4};
		affiche(split(t));
	}
}
