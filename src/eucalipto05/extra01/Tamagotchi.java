package eucalipto05.extra01;

public class Tamagotchi {
    private int hambre = 5;
    private int felicidad = 5;
    private int cansancio = 5;
    private int limpieza = 5;

    public Tamagotchi() {
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        if (hambre > 10) {
            this.hambre = 10;
        }
        else if(hambre < 0) {
            this.hambre = 0;
        } else {
            this.hambre = hambre;
        }


    }

    public int getFelicidad() {
        return felicidad;
    }

    public void setFelicidad(int felicidad) {
        if (felicidad > 10) {
            this.felicidad = 10;
        } else if (felicidad < 0) {
            this.felicidad = 0;
        } else {
            this.felicidad = felicidad;
        }
    }

    public int getCansancio() {
        return cansancio;
    }

    public void setCansancio(int cansancio) {
        if (10 < cansancio){
            this.cansancio = 10;
        } else if (cansancio < 0) {
            this.cansancio = 0;
        } else {
            this.cansancio = cansancio;
        }
    }

    public int getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(int limpieza) {
        if (10 < limpieza) {
            this.limpieza = 10;
        } else if (limpieza < 0){
            this.limpieza = 0;
        } else {
            this.limpieza = limpieza;
        }
    }

    public void alimentar(){
        this.hambre -= 5;
    }
    public void pasear(){
        this.cansancio -= 2;
        this.felicidad += 3;
    }
    public void limpiar(){
        this.limpieza = 10;
    }
    public void acariciar(){
        this.felicidad += 5;
    }
    public void obtenerHumor(){
        if (this.cansancio == 10){
            System.out.println("Dormido");
        }
        if (this.cansancio == 8){
            System.out.println("Cansado");
        }
        if (this.hambre < 7) {
            System.out.println("Hambriento");
        }
        if (this.limpieza < 3) {
            System.out.println("Sucio");
        }
        if (this.felicidad >= 4) {
            if (this.felicidad >= 7){
                System.out.println("Feliz");
            } else {
                System.out.println("Ok");
            }
        } else {
            System.out.println("Triste");
        }
    }
    public void pasarTiempo(){
        this.hambre -= 1;
        this.limpieza -= 1;
        if (getCansancio() > 0){
            this.cansancio -= 1;
        } else {
            this.cansancio = 10;
        }
    }
    public void status(){
        System.out.println("Hambre: " + this.hambre + "\n" +
                "Felicidad: " + this.felicidad + "\n" +
                "Cansancio: " + this.cansancio + "\n" +
                "Limpieza: " + this.limpieza);
    }

}
