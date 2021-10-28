
public class Test {
	
	public static void main(String[]args) {
		
		System.out.println("FORMATEUR:");
		System.out.println();
		//Test Formateur:
		Formateur f1 = new Formateur("texte.txt");
		f1.read();
		f1.print();
		System.out.println();
		
		System.out.println("FORMATEURJOLI:");
		System.out.println();
		//Test FormateurJoli
		FormateurJoli f = new FormateurJoli("texte.txt",30);
		//f.sc.useDelimiter("\n");
		//System.out.print(f.sc.next());
		f.read();
		f.print();
		System.out.println();
		
		System.out.println("QUELQUES TEST:");
		System.out.println();
		//Test metodes class Espace 
		//Espace e=new Espace();
		//System.out.println(e.toString2());
		//e.setSize(5);
		//System.out.println(e.len());
		
		//Test methodes class Paragraphe
		
	}
	

}
