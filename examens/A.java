public class A {
    void f() { }
    
    class C {
        void f() { }
    }

    class B extends C {
        void f() { }
    }

    public static void main(String[] args) {
        C c = new A().new B();
        c.f();
    }
}
