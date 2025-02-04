package fern06.ej03;

public class Caballo extends Animal {
    private String raza;

    public Caballo(String raza) {
        this.raza = raza;
    }

    public Caballo(String foto, String tipo_comida, String localizacion, String tamaño, String raza) {
        super(foto, tipo_comida, localizacion, tamaño);
        this.raza = raza;
    }

    public Caballo() {
    }
}
