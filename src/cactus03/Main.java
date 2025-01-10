package cactus03;

public class Main {
    public static void main(String[] args) {
        TeoriaObjetos05 test = new TeoriaObjetos05("Hola", 8);
        int a = test.sumarCinco();
        int b = TeoriaObjetos05.edadMasCinco(test);
        System.out.println(a);
        System.out.println(b);
    }
}
