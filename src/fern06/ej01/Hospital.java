package fern06.ej01;

import java.util.Arrays;

public class Hospital {
    private String nombre;
    private Persona[] pacientes;

    public Hospital(String nombre, Persona[] pacientes) {
        this.nombre = nombre;
        this.pacientes = pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Persona[] pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nombre='" + nombre + '\'' +
                ", pacientes=" + Arrays.toString(pacientes) +
                '}';
    }

    public void calcularPacientes(){
        for (Persona item : this.pacientes){
            System.out.println(item.getNombre() + " " + item.CalcularPeso());
        }
    }
}
