package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Yamaha", 180);
        Coche coche = new Coche("Toyota", 200, 4);

        System.out.println("--- Información del vehículo ---");
        vehiculo.mostrarInformacion();

        System.out.println("\n--- Información del coche ---");
        coche.mostrarInformacion();
    }
}
