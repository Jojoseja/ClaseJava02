package eucalipto05.ej5;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Ferrari", "Rojo", true, "ABcD123", Coche.Tipo.DEPORTIVO,2025,Coche.Seguro.ATODORIESGO);
        System.out.println(coche1);
    }
}
