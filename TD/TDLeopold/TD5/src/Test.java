public class Test {
    public static void main ( String[] args ) {

    	Roturier fanta = new Fantassin("aa", 3, 33, 77);
    	Roturier fanta2 = null;
        try {
			fanta2 = fanta.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
        System.out.println(((Fantassin)fanta).degats);
        System.out.println(((Fantassin)fanta2).degats);
    }    
}
