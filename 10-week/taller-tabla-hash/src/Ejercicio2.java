import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        HashTable<String, Integer> contador = new HashTable<>(20);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String texto = sc.nextLine();
        String[] palabras = texto.split("\\s+");

        for (String p : palabras) {
            Integer valor = contador.get(p);
            if (valor == null) contador.put(p, 1);
            else contador.put(p, valor + 1);
        }

        System.out.println("\nFrecuencia de palabras:");
        for (String p : palabras) {
            System.out.println(p + ": " + contador.get(p));
        }

        sc.close();
    }
}
