package ejercicio2;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Keli", 20, "7502610021");
        Estudiante e2 = new Estudiante("Laura Gómez", 19, "7502610034");

        System.out.println("--- Estudiante 1 ---");
        e1.mostrarDetalles();

        System.out.println("\n--- Estudiante 2 ---");
        e2.mostrarDetalles();

        // Una persona normal usa el método original
        Persona p = new Persona("Carlos Pérez", 35);
        System.out.println("\n--- Persona ---");
        p.mostrarDetalles();
    }
}
