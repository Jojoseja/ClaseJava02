package fern06.ej03;

public class Lobo extends Canino{
    public void comer(){
        System.out.println("Lobo Comiendo");
    }
    public void hacerRuido(){
        System.out.println("Ruido Lobuno");
    }

    public Lobo(String foto, String tipo_comida, String localizacion, String tamaño) {
        super(foto, tipo_comida, localizacion, tamaño);
    }

    public Lobo() {
    }
}
