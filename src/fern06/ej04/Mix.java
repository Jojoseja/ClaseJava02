package fern06.ej04;

public class Mix {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
        c.m1();
        c.m2();
        c.m3();
    }
}
