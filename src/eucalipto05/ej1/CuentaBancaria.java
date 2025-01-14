package eucalipto05.ej1;

public class CuentaBancaria {
    private double saldo = 0;
    private int nCuenta;
    private Estudiante titular;

    public CuentaBancaria(double saldo, int nCuenta, Estudiante titular) {
        this.saldo = saldo;
        this.nCuenta = nCuenta;
        this.titular = titular;
    }

    public CuentaBancaria(int nCuenta, Estudiante titular) {
        this.nCuenta = nCuenta;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public Estudiante getTitular() {
        return titular;
    }

    public void setTitular(Estudiante titular) {
        this.titular = titular;
    }

    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                ", nCuenta=" + nCuenta +
                ", titular=" + titular +
                '}';
    }
}
