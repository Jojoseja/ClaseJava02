package drago04;

public class Cuenta {
    float saldo;

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    void ingreso(float num){
        this.saldo += num;
    }
    void reintegro(float num){
        this.saldo -= num;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
