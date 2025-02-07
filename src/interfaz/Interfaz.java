package interfaz;

import java.util.Scanner;

public class Interfaz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MetodoPago tc = new TarjetaCredito(90000, "facundo", "1234", 8500);
        MetodoPago mp = new BilleteraVirtual("facu", "123", 45000);

        int opcion = 1;

        while (opcion != 0) {
            System.out.println("\n------------------------");
            System.out.println("--- SISTEMA DE PAGO ---");
            System.out.println("------------------------");
            System.out.println("\n1.Consultar saldo a pagar de TC");
            System.out.println("2.Consultar saldo a pagar de MP");
            System.out.println("3.Autenticarse y pagar TC");
            System.out.println("4.Autenticarse y pagar MP");
            System.out.println("0.Salir");

            System.out.print("\nIngrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    return;
                case 1:
                    System.out.println("\nSaldo a pagar: " + tc.getSaldo());
                    break;
                case 2:
                    System.out.println("\nSaldo a pagar: " + mp.getSaldo());
                    break;
                case 3:
                    tc.autenticar("facundo", "1234");
                    tc.pagar(100000);
                    break;
                case 4:
                    mp.autenticar("facu", "123");
                    mp.pagar(4700);
                    break;
                default:System.out.println("\nIngrese una opcion validad");
                break;
            }
        }

    }

}
