package drago04;

public class Cuenta {
    double saldo;
    public Cuenta(){
        saldo = 0.0f;
    }
    public Cuenta(double valor){
        this.saldo = valor;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void reintegro(double valor){
        saldo = saldo - valor;
    }
    public void ingreso(double valor){
        saldo += valor;
    }
}
