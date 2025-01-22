package eucalipto05.ej8;

import java.util.Arrays;

public class Video {
    private String titulo;
    private String descripcion;
    private String url;
    private int duracion;
    private Comentario[] listaComentario;

    public Video(String titulo, String descripcion, String url, int duracion, Comentario[] listaComentario) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.url = url;
        this.duracion = duracion;
        this.listaComentario = listaComentario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Comentario[] getListaComentario() {
        return listaComentario;
    }

    public void setListaComentario(Comentario[] listaComentario) {
        this.listaComentario = listaComentario;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", url='" + url + '\'' +
                ", duracion=" + duracion +
                ", listaComentario=" + Arrays.toString(listaComentario) +
                '}';
    }
}
