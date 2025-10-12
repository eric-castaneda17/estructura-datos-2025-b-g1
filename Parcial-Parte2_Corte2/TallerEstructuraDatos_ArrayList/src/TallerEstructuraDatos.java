import java.util.ArrayList;   // clase ArrayList para manejar listas dinámicas
import java.util.Scanner;     

public class TallerEstructuraDatos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Objeto para leer entrada del usuario

        
        ArrayList<String> productos = new ArrayList<>();

        // Vector (array): estructura fija con categorías predefinidas
        String[] categorias = {"Tecnología", "Hogar", "Aseo", "Bebidas", "Snacks"};

        int opcion; 

        // Ciclo principal 
        do {
            //menú principal
            System.out.println("\n--- MENÚ DE TECHMARKET ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar categorías");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            // 
            opcion = sc.nextInt();
            sc.nextLine();

            // Estructura switch para ejecutar cada opción del menú
            switch (opcion) {

                // Opción 1: agregar producto
                case 1:
                    System.out.print("Ingrese nombre del producto: ");
                    String p = sc.nextLine(); // leer el nombre del producto
                    if (!p.isEmpty()) { 
                        productos.add(p); // se agrega el producto al ArrayList
                        System.out.println("Producto agregado correctamente.");
                    } else {
                        System.out.println("El nombre no puede estar vacío.");
                    }
                    break;

                // Opción 2: listar productos
                case 2:
                    System.out.println("\nProductos registrados:");
                    if (productos.isEmpty()) { 
                        System.out.println("No hay productos registrados.");
                    } else {
                        
                        for (String prod : productos) {
                            System.out.println("- " + prod);
                        }
                    }
                    break;

                // Opción 3: eliminar producto
                case 3:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String eliminar = sc.nextLine(); 
                    if (productos.remove(eliminar)) { 
                        System.out.println("Producto eliminado con éxito.");
                    } else {
                        System.out.println("El producto no existe en la lista.");
                    }
                    break;

                // Opción 4: mostrar categorías
                case 4:
                    System.out.println("Categorías disponibles:");
                    
                    for (String cat : categorias) {
                        System.out.println("* " + cat);
                    }
                    break;

                // Opción 0: salir del programa
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                // Si el usuario ingresa una opción no válida
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }

        } while (opcion != 0); // El ciclo se repite mientras la opción sea diferente de 0

        sc.close(); 
    }
}
