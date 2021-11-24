import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args){
		Arbre a = new Arbre("/home/yacine/test");
		a.affiche();
		System.out.println();
		StringTransformation test = new StringTransformation() {

			@Override
			public String transf(String s) {

				return s+".blah";
			}
		};
		a.map(test);
		a.affiche();
		System.out.println();
		Arbre b = new Arbre("/home/yacine/test");
		b.traverser(".txt");
		System.out.println();
		b.supprimer(".txt");
		b.affiche();
	}

}
