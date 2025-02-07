package interfaz;

public abstract class MetodoPago implements IAutenticable {

    protected double saldo;

    public MetodoPago(double saldo) {
        this.saldo = saldo;
    }

    public abstract void pagar(double monto);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
