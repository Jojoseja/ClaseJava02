package eucalipto05.ej1;

public class Estudiante {
    private static int cont = 1;
    private final int id;
    private String nombre;
    private double nota;
    private String dni;

    public Estudiante(String nombre, double nota, String dni) {
        this.id = cont;
        Estudiante.cont += 1;
        this.nombre = nombre;
        this.nota = nota;
        this.dni = dni;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Estudiante.cont = cont;
    }

    public int getId() {
        return id;
    }

    public int getID(){
        return id;
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

    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nota=" + nota +
                ", dni='" + dni + '\'' +
                '}';
    }
}
