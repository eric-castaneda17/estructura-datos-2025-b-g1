import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Biblioteca {
    // -CONFIG
    // Constantes para definir el tamaño maximo del sistema
    private static final int MAX_LIBROS = 50;  // Tamaño máximo del catálogo
    private static final int SUCURSALES = 3;   // Columnas de la matriz disponibilidad

    private static Libro[] catalogo = new Libro[MAX_LIBROS];
    private static int[][] disponibilidad = new int[MAX_LIBROS][SUCURSALES];
    private static int numLibros = 0;

    private static NodoPrestamo prestamosActivos = null; // lista simple
    private static NodoHistorial historial = null;       // lista doble

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        //Bucle principal del menú
        do {
            System.out.println("\n----- BIBLIOTECA U1 -----");
            System.out.println("1. Alta de libro");
            System.out.println("2. Baja de libro");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Listar catálogo");
            System.out.println("5. Prestar libro");
            System.out.println("6. Devolver libro");
            System.out.println("7. Listar préstamos activos");
            System.out.println("8. Ver historial adelante");
            System.out.println("9. Ver historial atrás");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = leerEntero();

            // Selección de operaciones
            switch (opcion) {
                case 1: cargarLibro(); break;
                case 2: eliminarLibro(); break;
                case 3: buscarLibroPorTitulo(); break;
                case 4: listarCatalogo(); break;
                case 5: prestarLibro(); break;
                case 6: devolverLibro(); break;
                case 7: listarPrestamos(); break;
                case 8: listarHistorialAdelante(); break;
                case 9: listarHistorialAtras(); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    // ------------- MÓDULOS ---------
    // Alta de libro
    public static void cargarLibro() {
        if (numLibros >= MAX_LIBROS) {
            System.out.println("Catálogo lleno.");
            return;
        }
        System.out.print("Código: ");
        int codigo = leerEntero();

        // Verificar duplicados
        for (int i = 0; i < numLibros; i++) {
            if (catalogo[i].codigo == codigo && catalogo[i].activo) {
                System.out.println("Ya existe un libro con ese código.");
                return;
            }
        }

        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Stock inicial: ");
        int stock = leerEntero();

        catalogo[numLibros] = new Libro(codigo, titulo, autor, stock);
        for (int j = 0; j < SUCURSALES; j++) {
            disponibilidad[numLibros][j] = stock;
        }
        numLibros++;

        agregarHistorial("ALTA libro " + codigo);
        System.out.println("Libro registrado.");
    }

    //
    public static void eliminarLibro() {
        System.out.print("Código del libro: ");
        int codigo = leerEntero();

        for (int i = 0; i < numLibros; i++) {
            if (catalogo[i].codigo == codigo && catalogo[i].activo) {
                catalogo[i].activo = false; // baja lógica
                agregarHistorial("BAJA libro " + codigo);
                System.out.println("Libro dado de baja.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    // Búsqueda por título
    public static void buscarLibroPorTitulo() {
        System.out.print("Título: ");
        String titulo = sc.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < numLibros; i++) {
            if (catalogo[i].activo && catalogo[i].titulo.equalsIgnoreCase(titulo)) {
                System.out.println(catalogo[i]);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No se encontró.");
    }

    // Listar catálogo de libros
    public static void listarCatalogo() {
        for (int i = 0; i < numLibros; i++) {
            if (catalogo[i].activo) {
                System.out.println(catalogo[i]);
            }
        }
    }

    // Prestar libro (registrar un préstamo)
    public static void prestarLibro() {
        System.out.print("Código de libro: ");
        int codigo = leerEntero();
        Libro libro = buscarPorCodigo(codigo);
        if (libro == null || !libro.activo) {
            System.out.println("Libro no disponible.");
            return;
        }
        if (libro.stock <= 0) {
            System.out.println("Sin stock.");
            return;
        }
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();

        Prestamo p = new Prestamo(codigo, usuario, LocalDateTime.now());
        NodoPrestamo nuevo = new NodoPrestamo(p);
        nuevo.next = prestamosActivos;
        prestamosActivos = nuevo;

        libro.stock--;
        agregarHistorial("PRESTAMO libro " + codigo);
        System.out.println("Préstamo registrado.");
    }

    // Devolver libro
    public static void devolverLibro() {
        System.out.print("Código de libro a devolver: ");
        int codigo = leerEntero();
        NodoPrestamo actual = prestamosActivos, prev = null;

        while (actual != null) {
            if (actual.data.codigoLibro == codigo && !actual.data.devuelto) {
                actual.data.devuelto = true;

                if (prev == null) {
                    prestamosActivos = actual.next;
                } else {
                    prev.next = actual.next;
                }
                Libro libro = buscarPorCodigo(codigo);
                if (libro != null) libro.stock++;
                agregarHistorial("DEVOLUCION libro " + codigo);
                System.out.println("Devolución realizada.");
                return;
            }
            prev = actual;
            actual = actual.next;
        }
        System.out.println("Préstamo no encontrado.");
    }

    // Listar préstamos
    public static void listarPrestamos() {
        NodoPrestamo actual = prestamosActivos;
        while (actual != null) {
            System.out.println(actual.data);
            actual = actual.next;
        }
    }

    // Historial adelante
    public static void listarHistorialAdelante() {
        if (historial == null) {
            System.out.println("Historial vacío.");
            return;
        }
        NodoHistorial actual = historial;
        // ir al primero
        while (actual.prev != null) actual = actual.prev;
        while (actual != null) {
            System.out.println(actual);
            actual = actual.next;
        }
    }

    //  Historial atrás
    public static void listarHistorialAtras() {
        if (historial == null) {
            System.out.println("Historial vacío.");
            return;
        }
        NodoHistorial actual = historial;
        while (actual != null) {
            System.out.println(actual);
            actual = actual.prev;
        }
    }

    // ---------- AUXILIARES ----------
    private static void agregarHistorial(String operacion) {
        NodoHistorial nuevo = new NodoHistorial(operacion, LocalDateTime.now());
        if (historial != null) {
            historial.next = nuevo;
            nuevo.prev = historial;
        }
        historial = nuevo;
    }
    // Buscar libro por el código
    private static Libro buscarPorCodigo(int codigo) {
        for (int i = 0; i < numLibros; i++) {
            if (catalogo[i].codigo == codigo && catalogo[i].activo) {
                return catalogo[i];
            }
        }
        return null;
    }

    private static int leerEntero() {
        while (true) {
            try {
                String s = sc.nextLine();
                return Integer.parseInt(s);
            } catch (Exception e) {
                System.out.print("Número inválido, reingrese: ");
            }
        }
    }
}

// CLASES
class Libro {
    int codigo;
    String titulo;
    String autor;
    int stock;
    boolean activo;

    public Libro(int codigo, String titulo, String autor, int stock) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
        this.activo = true;
    }

    public String toString() {
        return "[Código=" + codigo + ", Título=" + titulo + ", Autor=" + autor + ", Stock=" + stock + "]";
    }
}
// Clase Prestamo: modelo para préstamos de usuarios
class Prestamo {
    int codigoLibro;
    String usuario;
    LocalDateTime fecha;
    boolean devuelto;

    public Prestamo(int codigoLibro, String usuario, LocalDateTime fecha) {
        this.codigoLibro = codigoLibro;
        this.usuario = usuario;
        this.fecha = fecha;
        this.devuelto = false;
    }

    public String toString() {
        return "[Libro=" + codigoLibro + ", Usuario=" + usuario + ", Fecha=" + fecha + ", Devuelto=" + devuelto + "]";
    }
}
// Nodo de lista simple para préstamos
class NodoPrestamo {
    Prestamo data;
    NodoPrestamo next;
    public NodoPrestamo(Prestamo p) { this.data = p; }
}
// Nodo de lista doble para historial
class NodoHistorial {
    String operacion;
    String fechaHora;
    NodoHistorial next, prev;

    public NodoHistorial(String operacion, LocalDateTime fecha) {
        this.operacion = operacion;
        this.fechaHora = fecha.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public String toString() {
        return "[" + fechaHora + "] " + operacion;
    }
}
