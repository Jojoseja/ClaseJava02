package eucalipto05.extra02;

public class Pelicula {
    private String titulo;
    private String genero;
    private int duracion;
    private int edadMinima;

    public Pelicula() {
        this.titulo = "Peliculon";
        this.genero = "Accionante";
        this.duracion = 100;
        this.edadMinima = 0;
    }

    public Pelicula(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = 100;
        this.edadMinima = 0;
    }

    public Pelicula(String titulo, String genero, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public boolean esAptaParaEdad(int edad){
        boolean apto = true;
        if (edad < this.edadMinima){
            apto = false;
        }
        return apto;
    }

    public void obtenerDuracionFormato(){
        int horas = this.duracion/60;
        int minutos = this.duracion%60;
        System.out.println("La duracion es de: " + horas + " y " + minutos);
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                ", edadMinima=" + edadMinima +
                '}';
    }
}
