package interfaz;

public class TarjetaCredito extends MetodoPago {

    private int limiteTarjeta;
    private String nombreU, claveU;

    public TarjetaCredito(int limiteTarjeta, String nombreU, String claveU, double saldo) {
        super(saldo);
        this.limiteTarjeta = limiteTarjeta;
        this.claveU = claveU;
        this.nombreU = nombreU;
    }

    @Override
    public void pagar(double monto) {

        if ((monto <= limiteTarjeta) && (monto <= saldo)) {
            saldo -= monto;
            System.out.println("Monto a debitar: " + monto);
            System.out.println("Saldo actualizado: " + saldo);
        } else {
            System.out.println("Monto a debitar: " + monto);
            System.out.println("Saldo insuficiente y/o el monto a pagar supera tu limite");
        }
    }

    @Override
    public boolean autenticar(String usuario, String clave) {

        if ((nombreU.equalsIgnoreCase(usuario)) && (claveU.equals(clave))) {
            System.out.println("\nAutenticacion exitosa");
            return true;
        }
        System.out.println("\nFallo la autentificacion para poder pagar");
        return false;
    }

    public int getLimiteTarjeta() {
        return limiteTarjeta;
    }

    public void setLimiteTarjeta(int limiteTarjeta) {
        this.limiteTarjeta = limiteTarjeta;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getClaveU() {
        return claveU;
    }

    public void setClaveU(String claveU) {
        this.claveU = claveU;
    }
    
}