public class ArregloCaracteres {
    public static void main(String[] args) {
        // Declaración e inicialización del arreglo de caracteres
        char[] caracteres = {'h', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'y'};

        // Mostrar los valores almacenados en el arreglo
        System.out.println("Valores del arreglo de caracteres:");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Posición " + i + ": " + caracteres[i]);
        }
    }
}
