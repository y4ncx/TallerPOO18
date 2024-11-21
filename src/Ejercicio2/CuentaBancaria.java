package Ejercicio2;

class CuentaBancaria implements Transferencia, Retiro, PagoFactura {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }


    @Override
    public void transferir(double cantidad, String cuentaDestino) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Transferencia de " + cantidad + " a la cuenta " + cuentaDestino + " realizada con éxito.");
        } else {
            System.out.println("Saldo insuficiente para la transferencia.");
        }
    }


    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + " realizado con éxito.");
        } else {
            System.out.println("Saldo insuficiente para el retiro.");
        }
    }


    @Override
    public void pagarFactura(double monto, String factura) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Pago de factura " + factura + " por un monto de " + monto + " realizado con éxito.");
        } else {
            System.out.println("Saldo insuficiente para pagar la factura.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}

