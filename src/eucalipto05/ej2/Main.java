package eucalipto05.ej2;

public class Main {
    public static void main(String[] args) {
        Reloj re1 = new Reloj(0, 0, 0);
        Reloj re2 = new Reloj(23, 59, 60);
        Reloj.compararReloj(re1,re2);
        re1.devolverHora();
        re1.compararReloj(re2);
        System.out.println(re1);
        System.out.println(re2);
    }
}
