package eucalipto05.ej3;

public class Ordenador {
    PlacaBase placabase;
    Caja caja;
    FuenteAlimentacion fuentealimentacion;

    public Ordenador(PlacaBase placabase, Caja caja, FuenteAlimentacion fuentealimentacion) {
        this.placabase = placabase;
        this.caja = caja;
        this.fuentealimentacion = fuentealimentacion;
    }

    public PlacaBase getPlacabase() {
        return placabase;
    }

    public void setPlacabase(PlacaBase placabase) {
        this.placabase = placabase;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public FuenteAlimentacion getFuentealimentacion() {
        return fuentealimentacion;
    }

    public void setFuentealimentacion(FuenteAlimentacion fuentealimentacion) {
        this.fuentealimentacion = fuentealimentacion;
    }

    @Override
    public String toString() {
        return "Ordenador{" +
                "placabase=" + placabase +
                ", caja=" + caja +
                ", fuentealimentacion=" + fuentealimentacion +
                '}';
    }
}
