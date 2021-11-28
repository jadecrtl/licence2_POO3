public class Exo1 {
    private static int a=1;
    private int b=2;
    private final int c=3;

    public Exo1(){
        this.b = 2;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String [] args){
    System.out.println("Hello");
    // écrivez ici, lorsque c’est possible
    // des exemples qui modifient des valeurs de a, b et c
    a = 3;
    System.out.println(a);
    Exo1 essai = new Exo1();
    essai.setB(4);
    System.out.println(essai.b);
    }    
}
