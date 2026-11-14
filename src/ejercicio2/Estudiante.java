package ejercicio2;

// Clase derivada: un Estudiante "es una" Persona
public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    // Sobrescritura del método de Persona
    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matrícula: " + matricula);
    }
}
