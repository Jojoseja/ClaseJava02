package cactus03;

//Los metodos de una clase se usan para un objeto
//Si se usa la keyword STATIC se puede usar el metodo llamando a la CLASE en vez del objeto

public class TeoriaObjetos05 {
    private String nombre;
    private int edad;

    //En este caso se suma 5 a la edad de un objeto
    public int sumarCinco(){
        return this.edad+5;
    }
    //En este otro caso se hace llamando a la clase TeoriaObjetos05, es más útil cuando se usan varios objetos
    public static int edadMasCinco(TeoriaObjetos05 ejemplo){
        return ejemplo.getEdad()+5;
    }



    public TeoriaObjetos05() {
    }

    public TeoriaObjetos05(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
