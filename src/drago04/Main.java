package drago04;

public class Main {
    public static void main(String[] args) {
        /*
        Estudiante es1 = new Estudiante("Al", "Berto", 123);
        System.out.println(es1.getLname());
        es1.setLname("Varo");
        System.out.println(es1.getLname());
        */
        Cuenta a = new Cuenta(0);
        Cuenta b = new Cuenta(10);
        a.ingreso(40);
        System.out.println(a.getSaldo());
        b.reintegro(4.5f);
        System.out.println(b.getSaldo());
    }
}
