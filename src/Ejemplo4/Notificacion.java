package Ejemplo4;

public interface Notificacion {
    void enviarEmail(String destinatario, String mensaje);
    void enviarSMS(String numero, String mensaje);
}