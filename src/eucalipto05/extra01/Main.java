package eucalipto05.extra01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean juego = true;
        Scanner sc = new Scanner(System.in);
        int input;
        Tamagotchi tamago = new Tamagotchi();
        do {
            input = sc.nextInt();
            switch(input){
                case 0:
                    juego = false;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
            }
        }
        while (juego);
    }
}
