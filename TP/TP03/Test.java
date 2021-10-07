public class Test {
    public static void main(String[] args) {
        Piece pion = new Piece(false, "pion");//doit afficher P
        Piece cavalier = new Piece(true, "cavalier");//doit afficher c
        Piece roi = new Roi(true);//doit afficher r 
        Piece roi2 = new Roi(false);//doit afficher R

        System.out.println(pion.toString());
        System.out.println(cavalier.toString());
        System.out.println(roi.toString());
        System.out.println(roi2.toString());






    }
}
