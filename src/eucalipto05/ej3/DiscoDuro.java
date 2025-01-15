package eucalipto05.ej3;

public class DiscoDuro {
    String modelo;

    public DiscoDuro(String modelo) {
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
        return "DiscoDuro{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
