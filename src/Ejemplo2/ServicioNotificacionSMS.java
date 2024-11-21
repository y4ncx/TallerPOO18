package Ejemplo2;

public class ServicioNotificacionSMS implements EnvioSMS {
    @Override
    public void enviarSMS(String numero, String mensaje) {
        System.out.println("Enviando SMS a: " + numero);
        System.out.println("Mensaje: " + mensaje);
    }
}

