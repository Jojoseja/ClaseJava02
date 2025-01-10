package drago04;

public class Viaje {
    double km;
    double tiempo;

    public Viaje() {
    }

    public Viaje(double km, double tiempo) {
        this.km = km;
        this.tiempo = tiempo;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    public double calcularVelocidad(){
        return this.km/this.tiempo;
    }
}
