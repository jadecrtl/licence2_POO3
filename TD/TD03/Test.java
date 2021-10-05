public class Test {
    public static void main ( String [ ] args ) {
        A [ ] tab = new A [ 3 ] ;
        tab [ 0 ] = new A( ) ;
        tab [ 1 ] = new B( ) ;
        tab [ 2 ] = new C( ) ;
        for (int i =0; i <3; i ++) { 
            tab [ i ] . g ( ) ; 
        }

        Personne n = new Noble("Eric Zemmour");
        System.out.println(n);
        Personne n2 = new Pretre("François Hollande");
        System.out.println(n2);
        Personne n3 = new Roturier("Jean Castex");
        System.out.println(n3);
    }    
}
