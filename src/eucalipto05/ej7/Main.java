package eucalipto05.ej7;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Pokemon pok1 = new Pokemon("Pikachu", "Eléctrico", 25, 55, 35);
        Pokemon pok2 = new Pokemon("Charmander", "Fuego", 10, 52, 39);
        Pokemon pok3 = new Pokemon("Bulbasaur", "Planta/Veneno", 5, 49, 45);
        Pokemon[] equipo1 = {pok1,pok2};
        Jugador jug1 = new Jugador("Rojo", equipo1);
        jug1.setSeleccionado(1);
        System.out.println(jug1);
    }
}
