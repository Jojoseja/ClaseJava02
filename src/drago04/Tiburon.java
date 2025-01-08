package drago04;

public class Tiburon {
    String color;
    String ojo;
    String aleta;

    public Tiburon(String ojo, String color, String aleta) {
        this.ojo = ojo;
        this.color = color;
        this.aleta = aleta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOjo() {
        return ojo;
    }

    public void setOjo(String ojo) {
        this.ojo = ojo;
    }

    public String getAleta() {
        return aleta;
    }

    public void setAleta(String aleta) {
        this.aleta = aleta;
    }
}
