package ejercicio1;

// Clase derivada: un Coche "es un" Vehiculo
public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, double velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima); // constructor de la clase base
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // reutiliza el código de Vehiculo
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}
