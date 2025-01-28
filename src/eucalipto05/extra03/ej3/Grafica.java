package eucalipto05.extra03.ej3;

public class Grafica {
    String modelo;

    public Grafica(String modelo) {
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
        return "Grafica{" +
                "modelo='" + modelo + '\'' +
                '}';
    }
}
