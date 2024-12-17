package arce01;
import java.util.ArrayList;
import java.util.Arrays;

public class Kaprekar {
    static int ordenarNumero (int num, boolean ord){
        String numl = Integer.toString(num);
        char[] numArray = new char[numl.length()];
        for (int i = 0 ; i < numl.length(); i++){
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
    static int kaprekar(int numero){
        int arr = ordenarNumero(numero, true);
        int abb = ordenarNumero(numero, false);
        int output = arr - abb;
        if (output == numero){
            return -1;
        } else {
            System.out.println(output);
            return kaprekar(output);
        }

    }
    public static void main(String[] args) {
        kaprekar(9993);
    }
}
