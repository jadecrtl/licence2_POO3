public class App2 {
    public static void f(int i ) throws Exception {
        if (i < 0) throw new Exception();
        else throw new RuntimeException();
    }
    public static void main(String[] args) throws Exception {
        try {
            f(-1);
        }
        catch (RuntimeException re) {
            System.out.print("RuntimeException ");
        }
        finally {
            System.out.print("Finally ");
        }
    }
}
