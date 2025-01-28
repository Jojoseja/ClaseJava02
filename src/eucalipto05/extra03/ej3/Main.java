package eucalipto05.extra03.ej3;

public class Main {
    public static void main(String[] args) {
        Procesador pro1 = new Procesador("Proce1");
        Grafica gra1 = new Grafica("Grafi1");
        Memoria mem1 = new Memoria("Memoria1");
        DiscoDuro dis1 = new DiscoDuro("Disco1", 500);
        PlacaBase pla1 = new PlacaBase("Placa1", mem1,pro1,gra1,dis1);
        Caja caj1 = new Caja("Caja1");
        FuenteAlimentacion fue1 = new FuenteAlimentacion("Fuente1");
        Ordenador ord1 = new Ordenador(pla1, caj1, fue1);
        //System.out.println(ord1);
        Juego jue01 = new Juego("Tetris", 50);
        Juego jue02 = new Juego("Zelda", 550);
        Juego jue03 = new Juego("Mario", 100);
        ord1.getPlacabase().getDiscoduro().instalarJuego(jue01);
        ord1.getPlacabase().getDiscoduro().mostrarJuegos();
        System.out.println(ord1.getPlacabase().getDiscoduro().espacioDisponible);
        ord1.getPlacabase().getDiscoduro().instalarJuego(jue02);
        ord1.getPlacabase().getDiscoduro().mostrarJuegos();
        System.out.println(ord1.getPlacabase().getDiscoduro().espacioDisponible);
        ord1.getPlacabase().getDiscoduro().instalarJuego(jue03);
        ord1.getPlacabase().getDiscoduro().mostrarJuegos();
        System.out.println(ord1.getPlacabase().getDiscoduro().espacioDisponible);
    }
}
