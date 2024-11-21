package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.00);

        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.transferir(200.00, "Cuenta123");

        cuenta.retirar(150.00);

        cuenta.pagarFactura(50.00, "Factura001");

        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}

