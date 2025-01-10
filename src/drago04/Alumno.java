package drago04;

public class Alumno {
    String nombre;
    double nota;
    public Alumno(){
        this.nota = 0;
    }
    public Alumno(String nom, double nota){
        this.nombre = nom;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void sumarnotas(double nota){

    }
    public static double mediaAlumnos(Alumno[] arrayAlumnos){
        double sum = 0;
        double media = 0;
        for(Alumno alu : arrayAlumnos){
            sum += alu.getNota();
        }
        media = sum/ arrayAlumnos.length;
        return media;
    }
}
