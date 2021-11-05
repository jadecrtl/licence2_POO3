
public class Test {
	public static void main(String[] args) {
		int[] t1 = {5,7,1,8,9,6,3};
		byte[] t2 = {00,001,01,100,110,101};
		String[] s = {"ba","aop","aopk","col","abp"};
		TriBinaire t3 = new TriBinaire(t2);
		TabEntiersTriable t = new TabEntiersTriable(t1);
		Dictionnaire s1 = new Dictionnaire(s);
		System.out.println(t);
		Triable.triBulles(t);
		System.out.println(t);
		System.out.println(t3);
		Triable.triBulles(t3);
		System.out.println(t3);
		System.out.println(s1);
		Triable.triBulles(s1);
		System.out.println(s1);
	}
}
