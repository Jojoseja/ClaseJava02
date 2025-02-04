package fern06.ej06;

public class Tecnico extends Operario{
    public Tecnico() {
    }

    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Tecnico";
    }
}
