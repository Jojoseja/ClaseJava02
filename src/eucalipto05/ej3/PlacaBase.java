package eucalipto05.ej3;

public class PlacaBase {
    private String modelo;
    private Memoria memoria;
    private Procesador procesador;
    private Grafica grafica;
    private DiscoDuro discoduro;

    public PlacaBase(String modelo, Memoria memoria, Procesador procesador, Grafica grafica, DiscoDuro discoduro) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.procesador = procesador;
        this.grafica = grafica;
        this.discoduro = discoduro;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Grafica getGrafica() {
        return grafica;
    }

    public void setGrafica(Grafica grafica) {
        this.grafica = grafica;
    }

    public DiscoDuro getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(DiscoDuro discoduro) {
        this.discoduro = discoduro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "PlacaBase{" +
                "modelo='" + modelo + '\'' +
                ", memoria=" + memoria +
                ", procesador=" + procesador +
                ", grafica=" + grafica +
                ", discoduro=" + discoduro +
                '}';
    }
}
