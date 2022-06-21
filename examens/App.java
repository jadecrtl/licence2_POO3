public class App {
    static class A {
        void f(B b) {
            System.out.print("A.f(B) ");
        }
    }
    static class B extends A {
        @Override
        void f(B a) {
            System.out.print("B.f(B) ");
        }
        void f(A b) {
            System.out.print("B.f(A) ");
        }
    }
    public static void main (String[] args) {
        A a = new B();
        B b = (B)a;
        a.f(b);
        b.f(a);
    }
}