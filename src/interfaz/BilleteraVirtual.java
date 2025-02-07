package interfaz;

public class BilleteraVirtual extends MetodoPago {

    private String nombre, clave;

    public BilleteraVirtual(String nombre, String clave, double saldo) {
        super(saldo);
        this.nombre = nombre;
        this.clave = clave;
    }

    @Override
    public void pagar(double monto) {

        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Monto a debitar: " + monto);
            System.out.println("Saldo actualizado: " + saldo);
        } else {
            System.out.println("Monto a debitar: " + monto);
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public boolean autenticar(String usuario, String clave) {
        if ((nombre.equalsIgnoreCase(usuario)) && (clave.equalsIgnoreCase(clave))) {
            System.out.println("\nAutenticacion exitosa");
            return true;
        }
        System.out.println("Fallo la autentificacion para poder pagar");
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
}
