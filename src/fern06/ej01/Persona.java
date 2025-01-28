package fern06.ej01;

public class Persona {
    public enum TipoIMC {BAJO_PESO, NORMAL, SOBREPESO, OBESO, ERROR};
    private String nombre;
    private float peso;
    private float altura;

    public Persona(String nombre, float peso, float altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public TipoIMC CalcularPeso(){
        TipoIMC resultado;
        if (this.peso < 0 || this.altura < 0){
            resultado = TipoIMC.ERROR;
        } else {
            float formula = this.peso / (this.altura * this.altura);
            if (formula <= 18.5f) {
                resultado = TipoIMC.BAJO_PESO;
            } else if (formula <= 25){
                resultado = TipoIMC.NORMAL;
            } else if (formula <= 30){
                resultado = TipoIMC.SOBREPESO;
            } else {
                resultado = TipoIMC.OBESO;
            }
        }

        return resultado;
    }

    public void thresholds(){
        System.out.println("Los pesos para que varíe el IMC son: ");
        float altura2 = this.altura*this.altura;
        float threshold1 = altura2 * 18.5f;
        float threshold2 = altura2 * 25f;
        float threshold3 = altura2 * 30f;
        System.out.printf("El minimo de peso para Bajo_Peso es menor que: %1$.2f \n" ,threshold1);
        System.out.printf("Para peso normal tiene que estar entre %1$.2f y %2$.2f \n" ,threshold1, threshold2);
        System.out.printf("Para sobrepeso tiene que estar entre %1$.2f y %2$.2f \n"  ,threshold2, threshold3);
        System.out.printf("Para obeso tiene que ser mayor que %1$.2f \n" ,threshold3);
    }
}
