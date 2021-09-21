public class Test {
    public static void main(String[] args){
        Personne tony = new Personne("Parker","Tony",29);
        System.out.println(tony);
        Personne mickael = tony;
        mickael.setPrenom("Mickael");
        System.out.println(tony);//équivalent à System.out.println(tony.toString());
        //Voir remarque

        mickael.setNom("Gelabale");
        System.out.println(mickael);

        Personne A = new Personne("A","B",19);
        Personne C = new Personne("C", "D", 19);

        System.out.println(A);
        System.out.println(C);

        A.ajouter(15);
        C.ajouter(20);
        A.donne(C, 10);
        C.donne(C, A, 5);
        System.out.println(A);
        System.out.println(C);

    }
}
