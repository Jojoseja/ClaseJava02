package eucalipto05.ej7;

public class Combate{
    Jugador jug1;
    Jugador jug2;

    public Combate(Jugador jug1, Jugador jug2) {
        this.jug1 = jug1;
        this.jug2 = jug2;
    }

    public Jugador getJug1() {
        return jug1;
    }

    public void setJug1(Jugador jug1) {
        this.jug1 = jug1;
    }

    public Jugador getJug2() {
        return jug2;
    }

    public void setJug2(Jugador jug2) {
        this.jug2 = jug2;
    }

    @Override
    public String toString() {
        return "Combate{" +
                "jug1=" + jug1 +
                ", jug2=" + jug2 +
                '}';
    }
    public void iniciarCombate(){
        boolean turno1 = true;
        boolean combate = true;
        System.out.println("Empieza el combate");
        System.out.println("Jugador1 sale con " + jug1.getSeleccionado().getNombre() + "\n"
        + "Jugador2 sale con " + jug2.getSeleccionado().getNombre());
        int contadorTurnos = 1;
        int pokemon1 = 0;
        int pokemon2 = 0;
        do{
            if (turno1){
                if (jug1.getSeleccionado().getPuntosDeVida() <= 0){
                    jug1.seleccionarAuto();
                    if (jug1.getSeleccionado().getPuntosDeVida() > 0){
                        System.out.println("Sale " + jug1.getSeleccionado().getNombre());
                    }
                }
                System.out.println("Turno " + contadorTurnos);
                int daño = jug1.getSeleccionado().getPuntosDeAtaque();
                jug2.getSeleccionado().setPuntosDeVida(jug2.getSeleccionado().getPuntosDeVida()-daño);
                System.out.println(jug1.getSeleccionado().getNombre() + " le ha hecho " + daño + " a " + jug2.getSeleccionado().getNombre());
                int aux = jug2.getSeleccionado().getPuntosDeVida();
                if (aux < 0){
                    aux = 0;
                }
                System.out.println(jug2.getSeleccionado().getNombre() + " tiene " + aux + " puntos de vida !");
                contadorTurnos += 1;

                if (checkVida(jug2)){
                    System.out.println("Pierde Jugador2");
                    break;
                }
                turno1 = false;
            } else {
                if (jug2.getSeleccionado().getPuntosDeVida() <= 0){
                    jug2.seleccionarAuto();
                    if (jug2.getSeleccionado().getPuntosDeVida() > 0){
                        System.out.println("Sale " + jug2.getSeleccionado().getNombre());
                    }
                }
                System.out.println("Turno " + contadorTurnos);
                int daño = jug2.getSeleccionado().getPuntosDeAtaque();
                jug1.getSeleccionado().setPuntosDeVida(jug1.getSeleccionado().getPuntosDeVida()-daño);
                System.out.println(jug2.getSeleccionado().getNombre() + " le ha hecho " + daño + " a " + jug1.getSeleccionado().getNombre());
                int aux = jug1.getSeleccionado().getPuntosDeVida();
                if (aux < 0){
                    aux = 0;
                }
                System.out.println(jug1.getSeleccionado().getNombre() + " tiene " + aux + " puntos de vida !");
                contadorTurnos += 1;

                if (checkVida(jug1)){
                    System.out.println("Pierde Jugador1");
                    break;
                }
                turno1 = true;
            }
        }
        while(combate);
    }

    private int contarEquipo(Jugador jug){
        Pokemon[] lista = jug.getEquipo();
        int pokemons = 0;
        for (Pokemon item : lista){
            if (item != null){
                pokemons += 1;
            }
        }
        return pokemons;
    }

    private boolean checkCombate(){
        boolean combate = true;
        Pokemon[] equipo1 = jug1.getEquipo();
        Pokemon[] equipo2 = jug1.getEquipo();
        int pokemons1 = contarEquipo(jug1);
        int pokemons2 = contarEquipo(jug2);
        int debilitado1 = 0;
        int debilitado2 = 0;
        for(Pokemon item1 : equipo1){
            if (item1.getPuntosDeVida() <= 0){
                debilitado1 += 1;
            }
        }
        for(Pokemon item2 : equipo2){
            if (item2.getPuntosDeVida() <= 0){
                debilitado2 += 1;
            }
        }
        if (debilitado1 == pokemons1 || debilitado2 == pokemons2){
            combate = false;
        }
        return combate;
    }
    private boolean checkVida(Jugador jug1){
        boolean combate = false;
        Pokemon[] equipo1 = jug1.getEquipo();
        int pokemons1 = contarEquipo(jug1);
        int debilitado1 = 0;
        for(Pokemon item1 : equipo1){
            if (item1.getPuntosDeVida() <= 0){
                debilitado1 += 1;
            }
        }
        if (debilitado1 == pokemons1){
            combate = true;
        }
        return combate;
    }
}
