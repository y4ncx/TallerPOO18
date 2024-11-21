package Ejemplo2;

public class ServicioNotificacionEmail implements EnvioEmail {
    @Override
    public void enviarEmail(String destinatario, String mensaje) {
        System.out.println("Enviando email a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}