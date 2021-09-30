public class Combat {
    public static void main(String[] args) {
		Informations a = new Informations(500,500,500);
		Informations b = new Informations(400,800,600);
        System.out.println(a.toString());
        System.out.println(b.toString());
		Personnage p = new Personnage("Arthur",a,a);
		Personnage p2 =	new Personnage("Lancelot",b,b);
		
		p.lutte(p2);
    }
}
