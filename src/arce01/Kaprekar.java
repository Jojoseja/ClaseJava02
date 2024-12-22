package arce01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar {
    static Scanner sc = new Scanner (System.in);
    static int ordenarNumero (int num, boolean ord){
        String numl = Integer.toString(num);
        char[] numArray = new char[numl.length()];
        for (int i = 0; i < numl.length(); i++){
            numArray[i] = numl.charAt(i);
        }
        Arrays.sort(numArray);
        numl = "";
        if (!ord) {
            for (char a : numArray){
                numl += a;
            }
        } else {
            for (int j = numArray.length; j > 0 ; j--){
                numl += numArray[j-1];
            }
        }

        return Integer.valueOf(numl);
    }
    static int kaprekar(int numero, int counter){
        int arr = ordenarNumero(numero, true);
        int abb = ordenarNumero(numero, false);
        int output = arr - abb;
        if (output == numero){
            System.out.println("El número de veces que se ha ejecutado esta secuencia ha sido: " + counter);
            return -1;
        } else {
            System.out.println(output);
            counter += 1;
            return kaprekar(output, counter);
        }

    }
    public static void main(String[] args) {
        boolean valid = true;
        boolean repetir = true;
        int numerin;
        do {
            System.out.println("Introduce un número de 4 cifras: ");
            numerin = sc.nextInt();
            String numS = Integer.toString(numerin);
            if (numS.length() != 4){
                valid = false;
            } else {
                char numC = numS.charAt(0);
                for (int i = 0; i < numS.length(); i++){
                    if (numS.charAt(i) != numC){
                        repetir = false;
                        valid = true;
                    }
                }
                if (repetir){
                    System.out.println("Introduce un número donde no se repitan todas las cifras");
                    valid = false;
                }
            }

        } while (!valid);

        kaprekar(numerin, 0);
    }
}
