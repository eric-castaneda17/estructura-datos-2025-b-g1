

public class Ejercicio4 {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();

        // Insertamos al final
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);

        System.out.println("Lista hacia adelante:");
        lista.mostrarAdelante();

        System.out.println("Lista hacia atrás:");
        lista.mostrarAtras();

        // Insertamos al inicio
        lista.insertarInicio(5);
        System.out.println("Después de insertar 5 al inicio:");
        lista.mostrarAdelante();

        // Eliminar al inicio
        lista.eliminarInicio();
        System.out.println("Después de eliminar al inicio:");
        lista.mostrarAdelante();

        // Eliminar al final
        lista.eliminarFinal();
        System.out.println("Después de eliminar al final:");
        lista.mostrarAdelante();
    }
}
