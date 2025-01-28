package eucalipto05.extra03.ej3;

public class Procesador {
    String modelo;

    public Procesador(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Procesador{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
