package ejercicio3;

// Clase derivada: un Gerente "es un" Empleado
public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // reutiliza el método de Empleado
        System.out.println("Departamento: " + departamento);
    }
}
