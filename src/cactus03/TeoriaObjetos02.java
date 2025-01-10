package cactus03;

public class TeoriaObjetos02 {

    static class awa{
        //Las clases pueden tener metodos tambien
        int num = 1;

        static void ewe(){
            System.out.println(1);
        }
    }
    public static void main(String[] args) {
        //se les invoca de la misma manera
        awa id1 = new awa();
        awa.ewe();
    }
}