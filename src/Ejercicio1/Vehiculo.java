package Ejercicio1;

class Vehiculo implements Reparacion, Limpieza {

    @Override
    public void reparacion() {
        System.out.println("El vehículo está siendo reparado.");
    }


    @Override
    public void limpieza() {
        System.out.println("El vehículo está siendo limpiado.");
    }
}
