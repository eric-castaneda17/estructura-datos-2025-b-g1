import java.math.BigInteger; 
import java.util.Scanner;

public class Ejercicio4_ConversorBases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número: ");
        String numero = sc.nextLine().toUpperCase();
        System.out.println("Ingrese la base de origen (2, 10 o 16):");
        int base = sc.nextInt();

        boolean usoBigInteger = false;

        try {
            // Intenta convertir el número a long (si entra en el rango)
            long valor = Long.parseLong(numero, base);

            System.out.println("\n----------");
            System.out.println("Binario: " + Long.toString(valor, 2));
            System.out.println("Decimal: " + valor);
            System.out.println("Hexadecimal: " + Long.toString(valor, 16).toUpperCase());

        } catch (NumberFormatException e) {
            // Si el número es demasiado grande para long, se usa BigInteger
            usoBigInteger = true;
            BigInteger big = new BigInteger(numero, base);

            System.out.println("\n--- Conversión usando BigInteger ---");
            System.out.println("Binario: " + big.toString(2));
            System.out.println("Decimal: " + big.toString(10));
            System.out.println("Hexadecimal: " + big.toString(16).toUpperCase());
        }

        System.out.println("\n¿Se usó BigInteger? " + usoBigInteger);
        sc.close();
    }   
}

