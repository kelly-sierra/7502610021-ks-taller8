package ejercicio4;

public class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Getter publico: forma correcta de acceder a un atributo private
    public String getMarca() {
        return marca;
    }
}
