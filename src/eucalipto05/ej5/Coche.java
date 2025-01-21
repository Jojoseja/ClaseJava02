package eucalipto05.ej5;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.*;

public class Coche {
    String modelo;
    String color;
    boolean metalizada;
    String matricula;
    boolean valida;
    enum Tipo {MINI, UTILITARIO, FAMILIAR, DEPORTIVO};
    Tipo tipo;
    Date year;
    enum Seguro {TERCEROS, ATODORIESGO};
    private Seguro seguro;

    public static boolean isValid(String input) {
        // Define a regex pattern to match exactly 4 letters and 3 numbers
        String regex = "^[A-Za-z]{4}\\d{3}$";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher for the input string
        Matcher matcher = pattern.matcher(input);

        // Return true if the input matches the regex pattern
        return matcher.matches();
    }

    public Coche(String modelo, String color, boolean metalizada, String matricula, Tipo tipo, int year, Seguro seguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizada = metalizada;
        this.matricula = matricula;
        this.valida = isValid(matricula);
        LocalDate localDate = LocalDate.of(year, 1, 1);
        this.year = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.tipo = tipo;
        this.seguro = seguro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMetalizada() {
        return metalizada;
    }

    public void setMetalizada(boolean metalizada) {
        this.metalizada = metalizada;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguo(Seguro seguro) {
        this.seguro = seguro;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", metalizada=" + metalizada +
                ", matricula='" + matricula + '\'' +
                ", valida=" + valida +
                ", tipo=" + tipo +
                ", year=" + year +
                ", seguo=" + seguro +
                '}';
    }

}
