public class Test2 {
    public static int f(int n) {
        if (n > 0) {
            return n - m(f(n-1));
        }
        return 1;
    }

    public static int m(int n) {
        if (n > 0) {
            return n - f(m(n-1));
        }
        return 0;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(f(i));
        }
    }
}