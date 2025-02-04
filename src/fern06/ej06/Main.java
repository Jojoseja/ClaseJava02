package fern06.ej06;

public class Main {
    public static void main(String[] args) {
        Empleado emp01 = new Empleado("Ernesto");
        Directivo dir01 = new Directivo("David");
        Operario ope01 = new Operario("Oscar");
        Oficial ofe01 = new Oficial("Olga");
        Tecnico tec01 = new Tecnico("Tomas");
        System.out.println(dir01);
        System.out.println(emp01);
        System.out.println(ope01);
        System.out.println(ofe01);
        System.out.println(tec01);
    }
}
