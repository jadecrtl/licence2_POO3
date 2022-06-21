public class Test {
    public static void main(String[] args) {
        System.out.print((new Double(2) == (Double) 2.0) + ";");
        System.out.print((new Double(2) == new Double(2)) + ";");
        System.out.print(((Double) ((double) ((int) 2.0)) == (Double) 2.0) + ";");
        System.out.print((2.0 == (Double) ((double) 2)) + ";");
    }
}
