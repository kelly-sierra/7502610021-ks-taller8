package ejercicio1;

// Clase base
public class Vehiculo {
    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
