package eucalipto05.ej4;

import java.util.Arrays;

public class Personaje {
    String nombre;
    String especie;
    String planetaOrigen;
    String[] habilidades;
    String bando;

    public Personaje(String nombre, String especie, String planetaOrigen, String[] habilidades, String bando) {
        this.nombre = nombre;
        this.especie = especie;
        this.planetaOrigen = planetaOrigen;
        this.habilidades = habilidades;
        this.bando = bando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPlanetaOrigen() {
        return planetaOrigen;
    }

    public void setPlanetaOrigen(String planetaOrigen) {
        this.planetaOrigen = planetaOrigen;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    public String getBando() {
        return bando;
    }

    public void setBando(String bando) {
        this.bando = bando;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", planetaOrigen='" + planetaOrigen + '\'' +
                ", habilidades=" + Arrays.toString(habilidades) +
                ", bando='" + bando + '\'' +
                '}';
    }
}
