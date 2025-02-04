package fern06.ej05;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    static ArrayList<Persona> listaCompleta = new ArrayList<>();

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        listaCompleta.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public static void mostrarNombres(){
        for (Persona item : listaCompleta){
            System.out.println(item.getNombre());
        }
    }
}
