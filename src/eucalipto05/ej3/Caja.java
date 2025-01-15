package eucalipto05.ej3;

public class Caja {
    String modelo;

    public Caja(String modelo) {
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
        return "Caja{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
