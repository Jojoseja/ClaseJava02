package drago04;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la distancia (km)");
        double inp1 = sc.nextDouble();
        System.out.println("Introduce el tiempo (horas)");
        double inp2 = sc.nextDouble();
        Viaje viA = new Viaje(inp1,inp2);
        Viaje viB = new Viaje();
        viB.setKm(20);
        viB.setTiempo(2);
        System.out.println(inp1/inp2);
        System.out.println(viB.calcularVelocidad());
        */
        double media = 0;
        double suma = 0;
        Alumno al1 = new Alumno();
        Alumno al2 = new Alumno("Beatriz", 3);
        Alumno al3 = new Alumno("Carlos", 5);
        Alumno al4 = new Alumno("Diana", 8);
        Alumno al5 = new Alumno("Esteban", 6);
        Alumno[] s = {al1,al2,al3,al4,al5};
        System.out.println(Alumno.mediaAlumnos(s));
    }
}