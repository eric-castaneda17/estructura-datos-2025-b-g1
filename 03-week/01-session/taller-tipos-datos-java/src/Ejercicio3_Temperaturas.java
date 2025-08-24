import java.util.Scanner;

public class Ejercicio3_Temperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa las temperaturas separadas por comas: ");
        String datos = sc.nextLine();

        // Convierte la entrada en un arreglo de números
        String[] partes = datos.split(",");
        double[] temperaturas = new double[partes.length];
        for (int i = 0; i < partes.length; i++) {
            temperaturas[i] = Double.parseDouble(partes[i].trim());
        }

        // Inicializa valores para cálculo
        double min = temperaturas[0];
        double max = temperaturas[0];
        double suma = 0;

        // Calcula mínimo, máximo y suma
        for (double t : temperaturas) {
            if (t < min) min = t;
            if (t > max) max = t;
            suma += t;
        }

        double promedio = suma / temperaturas.length;

        // Cálculo de la varianza
        double sumaCuadrados = 0;
        for (double t : temperaturas) {
            sumaCuadrados += Math.pow(t - promedio, 2);
        }
        double varianza = sumaCuadrados / temperaturas.length;

      
        double desviacion = Math.sqrt(varianza);

        // Resultados finales
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Promedio: " + promedio);
        System.out.println("Desviación estándar: " + desviacion);

        sc.close();
    }
}
