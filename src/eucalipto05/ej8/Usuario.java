package eucalipto05.ej8;

import java.util.Arrays;

public class Usuario {
    private String nombreUsuario;
    private String contraseña;
    private String nombre;
    private String apellido;
    private int edad;
    private String biografia;
    private Video[] listaVideos;

    public Usuario(String nombreUsuario, String contraseña, String nombre, String apellido, int edad, String biografia, Video[] listaVideos) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.biografia = biografia;
        this.listaVideos = listaVideos;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public Video[] getListaVideos() {
        return listaVideos;
    }

    public void setListaVideos(Video[] listaVideos) {
        this.listaVideos = listaVideos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", biografia='" + biografia + '\'' +
                ", listaVideos=" + Arrays.toString(listaVideos) +
                '}';
    }
}
