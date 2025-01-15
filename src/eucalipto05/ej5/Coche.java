package eucalipto05.ej5;

import java.util.Date;

public class Coche {
    String modelo;
    String color;
    boolean metalizada;
    String matricula;
    boolean valida;
    enum Tipo {MINI, UTILITARIO, FAMILIAR, DEPORTIVO};
    Tipo tipo;
    Date año;
    enum Seguro {TERCEROS, ATODORIESGO};
    private Seguro seguro;

    /*public validarMatricula(){
        String matri = this.matricula;
        for
    }*/

    public Coche(String modelo, String color, boolean metalizada, String matricula, Tipo tipo, Date año, Seguro seguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizada = metalizada;
        this.matricula = matricula;
        this.tipo = tipo;
        this.año = año;
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

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
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
                ", año=" + año +
                ", seguo=" + seguro +
                '}';
    }

}
