package ejercicio3;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Ana Torres", 2500000);
        Gerente gerente = new Gerente("Luis Martínez", 6000000, "Ventas");

        System.out.println("--- Empleado ---");
        empleado.mostrarDetalles();

        System.out.println("\n--- Gerente ---");
        gerente.mostrarDetalles();
    }
}
