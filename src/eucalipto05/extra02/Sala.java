package eucalipto05.extra02;

import java.util.Arrays;

public class Sala {
    private int numeroSala;
    private int capacidad;
    private Pelicula peliculaEnProyeccion;
    private int[] butacas;
    private int[] butacasCompradas = new int[this.capacidad];


    public void relleno(){
        int[] butacada = new int[this.capacidad];
        for(int i = 0; i < this.capacidad; i++){
            butacada[i] = i+1;
        }
        this.butacas = butacada;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Pelicula getPeliculaEnProyeccion() {
        return peliculaEnProyeccion;
    }

    public void setPeliculaEnProyeccion(Pelicula peliculaEnProyeccion) {
        this.peliculaEnProyeccion = peliculaEnProyeccion;
    }

    public int[] getButacas() {
        return butacas;
    }

    public void setButacas(int[] butacas) {
        this.butacas = butacas;
    }

    public Sala() {
        this.capacidad = 20;
        this.butacas = new int[this.capacidad];
    }

    public Sala(int numeroSala, int capacidad) {
        this.numeroSala = numeroSala;
        this.capacidad = capacidad;
        this.butacas = new int[this.capacidad];
    }

    public Sala(int numeroSala, int capacidad, Pelicula peliculaEnProyeccion) {
        this.numeroSala = numeroSala;
        this.capacidad = capacidad;
        this.peliculaEnProyeccion = peliculaEnProyeccion;
        this.butacas = new int[this.capacidad];
        this.relleno();
        this.butacasCompradas = this.butacas;
    }

    public void asignarPelicula(Pelicula pelicula){
        this.peliculaEnProyeccion = pelicula;
    }

    public boolean estaDisponible(){
        boolean disponible = true;
        if (this.peliculaEnProyeccion == null){
            disponible = false;
        }
        return disponible;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numeroSala=" + numeroSala +
                ", capacidad=" + capacidad +
                ", peliculaEnProyeccion=" + peliculaEnProyeccion +
                ", butacas=" + Arrays.toString(butacas) +
                '}';
    }

    public int generarButaca(){
        int butaca=0;
        int number;
        boolean testing = true;
        int contador=0;
        if (butacaCheck()) {
            do {
                number = (int)(Math.random() * this.capacidad);
                for (int i : this.butacasCompradas){
                    contador += 1;
                    if (i == number) {
                        butaca = number;
                        this.butacasCompradas[contador] = 0;
                        testing = false;
                        break;
                    }
                }
            } while (testing);
        } else {
            System.out.println("No quedan Butacas");
        }
        return butaca;
    }

    public boolean butacaCheck(){
        boolean butacasDisponibles = false;
        for (int num : this.butacasCompradas){
            if (num != 0) {
                butacasDisponibles = true;
                break;
            }
        }
        return butacasDisponibles;
    }

    public int[] getButacasCompradas() {
        return butacasCompradas;
    }
}
