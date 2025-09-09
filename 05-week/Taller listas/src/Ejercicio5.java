
public class Ejercicio5 {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        // Insertamos al final
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);

        System.out.println("Lista circular inicial:");
        lista.mostrarLista();

        // Insertar en posición 0
        lista.insertarPosicion(5, 0);
        System.out.println("Después de insertar 5 en posición 0:");
        lista.mostrarLista();

        // Insertar en posición 2
        lista.insertarPosicion(15, 2);
        System.out.println("Después de insertar 15 en posición 2:");
        lista.mostrarLista();

        // Eliminar posición 2
        lista.eliminarPosicion(2);
        System.out.println("Después de eliminar en posición 2:");
        lista.mostrarLista();

        // Eliminar cabeza
        lista.eliminarPosicion(0);
        System.out.println("Después de eliminar en posición 0:");
        lista.mostrarLista();
    }
}
