package eucalipto05.extra02;

public class Cine {
    private String nombre;
    private String ubicacion;
    private Sala[] salas = new Sala[4];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }

    public Cine() {
        this.nombre = "Cine Estándar";
        this.ubicacion = "Ubicación Estándar";
    }

    public Cine(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Cine(String nombre, String ubicacion, Sala[] salas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.salas = salas;
    }

    public Sala buscarSalaPorNumero(int numeroSala){
        return this.salas[numeroSala+1];
    }

    public void mostrarCartelera(){
        for (Sala item : salas){
            System.out.println(item.getPeliculaEnProyeccion());
        }
    }

    public int verificarCapacidadTotal() {
        int total = 0;
        for (Sala item : salas){
            total += item.getCapacidad();
        }
        return total;
    }

    public void ventaEntrada(int numSala){

        int numeroButaca;
        System.out.println("\t\t\t" + this.nombre + "\n"
        + "\t\t\t" + this.ubicacion + "\n"
        + this.getSalas()[numSala-1].getPeliculaEnProyeccion().getTitulo()
        + "\t" + this.getSalas()[numSala-1].getPeliculaEnProyeccion().getDuracion()
        + "\n" + this.getSalas()[numSala-1].getNumeroSala()
        + this.getSalas()[numSala-1].generarButaca());
    }
}
