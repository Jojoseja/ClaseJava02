package eucalipto05.ej7;

public class Pokemon {
    private String nombre;
    private String tipo;
    private int nivel;
    private int puntosDeVida;
    private int puntosDeAtaque;

    public Pokemon(String nombre, String tipo, int nivel, int puntosDeVida, int puntosDeAtaque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public void setPuntosDeAtaque(int puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nivel=" + nivel +
                ", puntosDeVida=" + puntosDeVida +
                ", puntosDeAtaque=" + puntosDeAtaque +
                '}';
    }
}
