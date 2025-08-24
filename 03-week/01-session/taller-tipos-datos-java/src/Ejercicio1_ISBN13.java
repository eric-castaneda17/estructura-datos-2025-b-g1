public class Ejercicio1_ISBN13 {

    // Método que verifica si un número dado es un ISBN-13 válido
    public static boolean isValidISBN13(String isbn) {

        // Un ISBN-13 debe tener exactamente 13 dígitos
        if (isbn == null || isbn.length() != 13) return false; 

        int suma = 0;

        // Recorre cada dígito aplicando la regla de validación ISBN-13
        for (int i = 0; i < isbn.length(); i++) {
            char c = isbn.charAt(i);
            if (!Character.isDigit(c)) return false; // Solo se aceptan números

            int d = c - '0'; 
            suma += d * (i % 2 == 0 ? 1 : 3); // Peso 1 en posiciones pares, 3 en impares
        }

        // Válido si la suma es múltiplo de 10
        return suma % 10 == 0;
    }

    public static void main(String[] args) {
        String prueba = "9780306406157"; // Ejemplo de prueba
        System.out.println("ISBN válido? " + isValidISBN13(prueba));
    }

}
