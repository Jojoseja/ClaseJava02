package eucalipto05.extra02;

public class Main {
    public static void main(String[] args) {
        Pelicula peli01 = new Pelicula("Pedro","Accion", 160, 13);
        Pelicula peli02 = new Pelicula("Me voy a comer a Niko", "Futura Biografia", 5, 0);
        Pelicula peli03 = new Pelicula("500 Días Separados", "Histórica", 1590, 0);
        Pelicula peli04 = new Pelicula("Deja las Monster", "Son malas para la salud", 10, 13);
        Sala sala01 = new Sala(1,10, peli01);
        Sala sala02 = new Sala(2,20, peli02);
        Sala sala03 = new Sala(3,15, peli03);
        Sala sala04 = new Sala(4,1, peli04);
        Sala[] arraySalas = {sala01, sala02, sala03, sala04};

        Cine cine01 = new Cine("Pochoclo", "Aqui abajo", arraySalas);
        cine01.ventaEntrada(4);
        for (int i : sala01.getButacasCompradas()){
            //System.out.println(i);
        }
    }
}
