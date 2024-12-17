package baobab02;

import org.w3c.dom.ls.LSOutput;

public class TeoriaStrings {
    public static void main(String[] args) {
        String cadena = "Hola buenos dias";
        //Hay que indicar el separador para el .split en este caso un espacio en blanco (" ")
        String[] palabras = cadena.split(" ");
        System.out.println("La cadena introducida tiene " + palabras.length + " palabras");
        System.out.println("La primera palabra es " + palabras[0]);
    }
}
