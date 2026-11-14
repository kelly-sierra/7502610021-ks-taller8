package ejercicio4;

public class Coche extends Vehiculo {

    public Coche(String marca) {
        super(marca);
    }

    public void mostrarMarca() {
        // ERROR 2 - Acceso a atributo private: descomenta la siguiente linea para ver el error
        // System.out.println(marca);

        // Solucion: usar el getter heredado
        System.out.println("Marca: " + getMarca());
    }
}
