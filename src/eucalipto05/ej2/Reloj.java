package eucalipto05.ej2;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    enum formato {DOCE, VEINTICUATRO}

    ;
    private int bateria = 100;
    formato modo = formato.DOCE;

    public Reloj(int hora, int minuto, int segundo) {
        int segOver = 0;
        int minOver = 0;
        if (segundo > 59) {
            segOver = segundo/60;
            segundo = segundo % 60;
        }
        this.segundo = segundo;
        minuto += segOver;
        if (minuto > 59){
            minOver = minuto/60;
            minuto = minuto % 60;
        }
        this.minuto = minuto;
        hora += minOver;
        if (hora > 23) {
            hora = hora % 24;
        }
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora % 24;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto % 60;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo % 60;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public formato getModo() {
        return this.modo;
    }

    public void setModo(formato modo) {
        this.modo = modo;
    }

    public void recargarPila() {
        this.bateria = 100;
        System.out.println("Batería Cargada");
    }

    public String toString() {
        return "Reloj{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                ", bateria=" + bateria +
                '}';
    }

    public void devolverHora() {
        if (this.bateria > 0) {
            switch (modo) {
                case DOCE:
                    String extra = "";
                    if (this.hora > 12) {
                        extra = "PM";
                    }
                    else {
                        extra = "AM";
                    }
                    System.out.printf("%2d-%2d-%2d %s \n" ,this.hora, this.minuto, this.segundo, extra);
                    break;
                case VEINTICUATRO:
                    System.out.printf("%2d-%2d-%2d \n", this.hora, this.minuto, this.segundo);
            }
            this.bateria -= 5;
        }
    }

    static public void compararReloj(Reloj reloj1, Reloj reloj2) {
        boolean hora = false;
        if (reloj1.getHora() == reloj2.getHora()
                && reloj1.getMinuto() == reloj2.getMinuto()
                && reloj1.getSegundo() == reloj2.getSegundo()) {
            hora = true;
        }
        if (hora) {
            System.out.println("Están en hora");
        } else {
            System.out.println("No están en hora");
        }

    }
    public void compararReloj(Reloj reloj1) {
        boolean hora = false;
        if (reloj1.getHora() == this.hora
                && reloj1.getMinuto() == this.minuto
                && reloj1.getSegundo() == this.segundo) {
            hora = true;
        }
        if (hora) {
            System.out.println("Están en hora");
        } else {
            System.out.println("No están en hora");
        }

    }
}

