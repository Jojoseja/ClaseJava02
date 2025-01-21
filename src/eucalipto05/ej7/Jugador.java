package eucalipto05.ej7;

import java.util.Arrays;

public class Jugador {
    private String nombre;
    private Pokemon[] equipo = new Pokemon[5];
    private Pokemon Seleccionado = equipo[0];

    public Jugador(String nombre, Pokemon[] equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Pokemon[] getEquipo() {
        return equipo;
    }

    public Pokemon getSeleccionado() {
        return Seleccionado;
    }

    public void setEquipo(Pokemon[] equipo) {
        this.equipo = equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSeleccionado(int posicion) {
        if (this.equipo[posicion].getPuntosDeVida() < 0){
            System.out.println("Este pokemon no tiene vida");
        } else {
            this.Seleccionado = equipo[posicion];
        }
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", equipo=" + Arrays.toString(equipo) +
                ", Seleccionado=" + Seleccionado +
                '}';
    }
}
