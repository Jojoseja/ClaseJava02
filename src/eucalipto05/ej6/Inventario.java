package eucalipto05.ej6;

import java.util.ArrayList;
import java.util.Arrays;

public class Inventario {
    int maxPrendas;
    Prenda[] prendas;

    public Inventario(int maxPrendas, Prenda[] prendas) {
        this.maxPrendas = maxPrendas;
        this.prendas = prendas;
    }

    public int getMaxPrendas() {
        return maxPrendas;
    }

    public void setMaxPrendas(int maxPrendas) {
        this.maxPrendas = maxPrendas;
    }

    public Prenda[] getPrendas() {
        return prendas;
    }

    public void setPrendas(Prenda[] prendas) {
        this.prendas = prendas;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "maxPrendas=" + maxPrendas +
                ", prendas=" + Arrays.toString(prendas) +
                '}';
    }
    public void agregarPrenda(Prenda ropa){
        for (Prenda item : this.prendas){
            if (item == ropa){
                if (ropa.getCantidad()+1 > this.maxPrendas){
                    System.out.println("Ya hay el máximo de prendas");
                } else {
                    ropa.setCantidad(ropa.getCantidad()+1);
                }
            }
        }
    }
    public void eliminarPrenda(int numero){
        Prenda item = this.prendas[numero];
        if(item.getCantidad() == 0){
            System.out.println("No te quedan mas prendas");
        } else {
            item.setCantidad(item.getCantidad()-1);
        }
    }
    public void mostrarinventario(){
        for (Prenda item : this.getPrendas()){
            System.out.printf("La prenda con el código: %1$s, con la descripcion: %2$s, con el precio: %3$.2f, con la talla: %4$s hay un total de %5$d \n",
                    item.getCodigo(), item.getDescripcion(), item.getPrecio(), item.getTalla(), item.getCantidad());
        }
    }
}
