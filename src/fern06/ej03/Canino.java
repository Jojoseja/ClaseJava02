package fern06.ej03;

public class Canino extends Animal{
    public void rugir(){
        System.out.println("Rugido Canino");
    }

    public Canino(String foto, String tipo_comida, String localizacion, String tamaño) {
        super(foto, tipo_comida, localizacion, tamaño);
    }

    public Canino() {
    }
}
