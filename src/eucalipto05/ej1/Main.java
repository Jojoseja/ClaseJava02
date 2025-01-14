package eucalipto05.ej1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Estudiante es01 = new Estudiante("Carlos", 10,"15A");
        CuentaBancaria cuBa01 = new CuentaBancaria(20, es01);
        CuentaBancaria cuBa02 = new CuentaBancaria(10, 21, es01);
        System.out.println(cuBa01);
        System.out.println(cuBa02);
    }
}