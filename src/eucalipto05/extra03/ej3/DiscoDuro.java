package eucalipto05.extra03.ej3;

import java.util.Arrays;

public class DiscoDuro {
    String modelo;
    int capacidad;
    int espacioDisponible;
    Juego[] juegosInstalados;

    public DiscoDuro(String modelo, int capacidad) {
        this.modelo = modelo; this.capacidad = capacidad; this.espacioDisponible = capacidad; this.juegosInstalados = new Juego[0];
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void instalarJuego(Juego juego){
        int cont = 0;
        Juego[] juegoNuevo = new Juego[this.juegosInstalados.length +1];
        if (juego.getEspacio() > this.espacioDisponible) {
            System.out.println("No hay espacio en el disco");
        } else {
            this.espacioDisponible -= juego.getEspacio();
            for (Juego item : this.juegosInstalados){
                juegoNuevo[cont] = item;
                cont += 1;
            }
            juegoNuevo[this.juegosInstalados.length] = juego;
            this.juegosInstalados = juegoNuevo;
        }
    }

    public Juego[] getJuegosInstalados() {
        return juegosInstalados;
    }

    @Override
    public String toString() {
        return "DiscoDuro{" +
                "modelo='" + modelo + '\'' +
                ", capacidad=" + capacidad +
                ", espacioDisponible=" + espacioDisponible +
                ", juegosInstalados=" + Arrays.toString(juegosInstalados) +
                '}';
    }
    public void mostrarJuegos(){
        int cont = 1;
        for (Juego item : this.juegosInstalados){
            System.out.println(cont + ". " +  item.getNombre());
            cont += 1;
        }
    }
}
