package eucalipto05.ej1;

public class Estudiante {
    private String nombre;
    private double nota;
    private String dni;

    public Estudiante(String nombre, double nota, String dni) {
        this.nombre = nombre;
        this.nota = nota;
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


}
