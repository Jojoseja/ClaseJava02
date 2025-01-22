package eucalipto05.ej7;
import java.util.Scanner;
import java.util.Arrays;

public class Jugador {
    private String nombre;
    private Pokemon[] equipo = new Pokemon[6];
    private Pokemon seleccionado;

    public Jugador(String nombre, Pokemon[] equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.seleccionado = this.equipo[0];
    }

    public String getNombre() {
        return nombre;
    }

    public Pokemon[] getEquipo() {
        return equipo;
    }

    public Pokemon getSeleccionado() {
        return seleccionado;
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
            this.seleccionado = equipo[posicion];
        }
    }
    public void agregarPokemon(Pokemon poke){
        Pokemon[] lista = this.equipo;
        int contador = 0;
        for (Pokemon item : lista){
            contador += 1;
            if (item == null){
                lista[contador] = poke;
                break;
            }
        }
        this.equipo = lista;
    }

    public void eliminarPokemon(int posicion){
        Pokemon[] lista = this.equipo;
        int contador = 0;
        Pokemon[] nuevaLista = new Pokemon[6];
        for (Pokemon item : lista){
            if (contador != posicion){
                nuevaLista[contador] = item;
                contador +=1;
            }
        }
        this.equipo = nuevaLista;
    }

    public void mostrarEquipo(){
        int contador = 0;
        for (Pokemon item : this.equipo){
            System.out.println(contador + ". " + item.getNombre());
            contador += 1;
        }
    }

    public void seleccionarPokemon(){
        boolean menu = true;
        Scanner sc = new Scanner(System.in);
        do {
            this.mostrarEquipo();
            System.out.println("Selecciona un pokemon: ");
            int input = sc.nextInt();
            try{
                setSeleccionado(input);
                menu = false;
            } catch (Exception e){
                System.out.println("Algo salió mal");
            }
        }
        while(menu);
    }
    public void seleccionarAuto(){
        boolean vivo = true;
        int contador = 0;
        if (getSeleccionado().getPuntosDeVida() <= 0){
            do {
                for(Pokemon item : this.equipo){
                    if (item.getPuntosDeVida() > 0){
                        setSeleccionado(contador);
                        vivo = false;
                        break;
                    }
                    contador += 1;
                }
            }
            while (vivo);
        }
        if (contador > 6){
            setSeleccionado(0);
        }
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", equipo=" + Arrays.toString(equipo) +
                ", Seleccionado=" + seleccionado +
                '}';
    }
}
