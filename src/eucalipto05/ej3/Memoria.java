package eucalipto05.ej3;

public class Memoria {
    String modelo;

    public Memoria(String modelo) {
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
        return "Memoria{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
