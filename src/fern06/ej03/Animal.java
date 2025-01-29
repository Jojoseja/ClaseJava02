package fern06.ej03;

public class Animal {

    private String foto;
    private String tipo_comida;
    private String localizacion;
    private String tamaño;

    public Animal(String foto, String tipo_comida, String localizacion, String tamaño) {
        this.foto = foto;
        this.tipo_comida = tipo_comida;
        this.localizacion = localizacion;
        this.tamaño = tamaño;
    }

    public Animal() {
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "foto='" + foto + '\'' +
                ", tipo_comida='" + tipo_comida + '\'' +
                ", localizacion='" + localizacion + '\'' +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }
    public void hacerRuido(){
        System.out.println("Ruido");
    }
    public void comer(){
        System.out.println("Comiendo");
    }
    public void dormir(){
        System.out.println("Durmiendo");
    }
    public void rugir(){
        System.out.println("Rugiendo");
    }
}
