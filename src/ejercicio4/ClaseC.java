package ejercicio4;

// ERROR 1 - Herencia multiple: descomenta la siguiente linea y comenta la de abajo para ver el error
// public class ClaseC extends ClaseA, ClaseB {

public class ClaseC extends ClaseA {
    // Solucion: heredar de una sola clase y usar composicion para la otra
    private ClaseB claseB = new ClaseB();

    public void saludarB() {
        claseB.saludarB();
    }
}
