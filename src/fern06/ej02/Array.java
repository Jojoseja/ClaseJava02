package fern06.ej02;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> listaCoches = new ArrayList<>();
        listaCoches.add("Audi");
        listaCoches.add("BMW");
        listaCoches.add("Citroen");
        System.out.println(listaCoches.get(1));
        listaCoches.set(2, "Mercedes");
        System.out.println(listaCoches);
        listaCoches.add("Volkswagen");
        System.out.println(listaCoches.size());
        System.out.println(listaCoches.contains("Mercedes"));
        listaCoches.add(1, "Porsche");
        System.out.println(listaCoches);
        System.out.println(listaCoches.indexOf("Porsche"));
        Object[] arrayCoches = listaCoches.toArray();
        for (Object item : arrayCoches){
            System.out.println(item);
        }
        String[] array2Coches = listaCoches.toArray(new String[0]);
        System.out.println(array2Coches.length);

    }
}
