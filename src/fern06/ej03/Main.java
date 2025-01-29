package fern06.ej03;

public class Main {
    public static void main(String[] args) {
        Animal ani001 = new Animal("?","Carnivoro","Europa","Grande");
        ani001.comer();
        ani001.rugir();
        Canino can001 = new Canino();
        can001.comer();
        can001.rugir();
        Lobo lobo001 = new Lobo();
        lobo001.comer();
        lobo001.hacerRuido();
        Animal ani002 = new Lobo();
        ani002.hacerRuido();
        System.out.println(ani002.getClass());
    }
}
