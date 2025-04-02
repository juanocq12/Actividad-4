public class OperacionesBasicas {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        int numeroA = 89;
        int numeroB = 323;

        // Operaciones aritméticas
        int suma = numeroA + numeroB;
        int resta = numeroA - numeroB;
        int multiplicacion = numeroA * numeroB;
        double division = (double) numeroA / numeroB; // Convertimos a double para obtener decimales

        // Mostrar los resultados en consola
        System.out.println("Número A: " + numeroA);
        System.out.println("Número B: " + numeroB);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
