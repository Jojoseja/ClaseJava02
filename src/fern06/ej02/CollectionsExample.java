package fern06.ej02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<String> listaCoches = new ArrayList<>(Arrays.asList("Audi", "BMW", "Porsche"));
        listaCoches.add("Mercedes");
        Collections.sort(listaCoches);
        ArrayList<String> listaNueva = new ArrayList<>(0);
        listaNueva.addAll(listaCoches);
        listaCoches.add("Bugatti");
        System.out.println(listaCoches);
        System.out.println(listaNueva);
    }
}
