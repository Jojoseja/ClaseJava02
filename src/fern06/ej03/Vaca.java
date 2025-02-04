package fern06.ej03;

public class Vaca extends Animal{
    private String nacionalidad;

    public Vaca(String foto, String tipo_comida, String localizacion, String tamaño, String nacionalidad) {
        super(foto, tipo_comida, localizacion, tamaño);
        this.nacionalidad = nacionalidad;
    }

    public Vaca() {
    }
}
