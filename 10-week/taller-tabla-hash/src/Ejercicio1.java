import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        HashTable<String, String> diccionario = new HashTable<>(10);
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n--- Diccionario usuario → rol ---");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Consultar rol");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Usuario: ");
                    String user = sc.nextLine();
                    System.out.print("Rol: ");
                    String rol = sc.nextLine();
                    diccionario.put(user, rol);
                    System.out.println("Agregado correctamente.");
                }
                case 2 -> {
                    System.out.print("Usuario: ");
                    String user = sc.nextLine();
                    String rol = diccionario.get(user);
                    System.out.println(rol != null ? "Rol: " + rol : "No existe el usuario.");
                }
                case 3 -> {
                    System.out.print("Usuario: ");
                    String user = sc.nextLine();
                    diccionario.remove(user);
                    System.out.println("Eliminado (si existía).");
                }
            }
        } while (op != 4);
        sc.close();
    }
}
