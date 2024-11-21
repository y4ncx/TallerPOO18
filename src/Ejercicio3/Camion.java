package Ejercicio3;

class Camion implements Conducible, Transportable {

    @Override
    public void conducir() {
        System.out.println("El camión está conduciendo por la carretera.");
    }


    @Override
    public void cargarMercancia() {
        System.out.println("El camión está cargando mercancías.");
    }
}
