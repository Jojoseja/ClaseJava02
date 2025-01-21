package eucalipto05.ej6;

public class Main {
    public static void main(String[] args) {
        Prenda pre1 = new Prenda("1AB","Camiseta",13.1d,"XL",1);
        Prenda pre2 = new Prenda("2CD","Pantalon",20.0d,"S",1);
        Prenda[] ropas = {pre1,pre2};
        Inventario inv1 = new Inventario(10,ropas);
        System.out.println(inv1);
        inv1.agregarPrenda(pre1);
        System.out.println(inv1);
        inv1.eliminarPrenda(0);
        System.out.println(inv1);
        inv1.mostrarinventario();
    }
}
