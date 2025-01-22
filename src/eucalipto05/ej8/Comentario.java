package eucalipto05.ej8;

import java.time.LocalDate;

public class Comentario {
    private Usuario usuario;
    private String texto;
    private LocalDate fecha;

    public Comentario(Usuario usuario, String texto, LocalDate fecha) {
        this.usuario = usuario;
        this.texto = texto;
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "usuario=" + usuario +
                ", texto='" + texto + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
