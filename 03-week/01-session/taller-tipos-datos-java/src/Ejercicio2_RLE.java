import java.util.Scanner;

public class Ejercicio2_RLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el texto a comprimir: ");
        String input = sc.nextLine();

        String compressed = compress(input);

        // Calcula la relación entre el tamaño comprimido y el original
        double ratio = (input.isEmpty()) ? 0 : (double) compressed.length() / input.length();

        System.out.println("Original: " + input);
        System.out.println("Comprimido: " + compressed);
        System.out.println("Ratio: " + ratio);

        sc.close();
    }

    // Algoritmo de compresión 
    public static String compress(String s) {
        if (s.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        int count = 1;

        // Recorre el texto agrupando caracteres repetidos consecutivos
        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                // Guarda el carácter seguido de la cantidad de repeticiones
                sb.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}
