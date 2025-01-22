package eucalipto05.ej7;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Pokemon pok1 = new Pokemon("Pikachu1", "Eléctrico", 25, 55, 35);
        Pokemon pok2 = new Pokemon("Charmander1", "Fuego", 10, 52, 39);
        Pokemon pok3 = new Pokemon("Bulbasaur2", "Planta/Veneno", 5, 49, 45);
        Pokemon pok4 = new Pokemon("Pichu2", "Eléctrico", 25, 55, 35);
        Pokemon pok5 = new Pokemon("Pachu2", "Eléctrico", 25, 55, 35);
        Pokemon pok6 = new Pokemon("Pochu2", "Eléctrico", 25, 55, 35);
        Pokemon[] equipo1 = {pok1,pok2};
        Pokemon[] equipo2 = {pok3,pok4,pok5,pok6};
        Jugador jug1 = new Jugador("Rojo", equipo1);
        Jugador jug2 = new Jugador("Azul", equipo2);
        Combate com1 = new Combate(jug1,jug2);
        com1.iniciarCombate();
    }
}
