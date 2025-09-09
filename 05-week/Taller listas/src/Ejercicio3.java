
public class Ejercicio3 {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        // Insertamos algunos elementos
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        lista.insertarFinal(40);

        System.out.println("Lista inicial:");
        lista.mostrarLista();

        // Eliminar en posición 2 (el 30)
        lista.eliminarPosicion(2);
        System.out.println("Después de eliminar en posición 2:");
        lista.mostrarLista();

        // Eliminar en posición 0 (el primer elemento: 10)
        lista.eliminarPosicion(0);
        System.out.println("Después de eliminar en posición 0:");
        lista.mostrarLista();

        // Intentar eliminar en posición inválida
        lista.eliminarPosicion(10); // fuera de rango
    }
}
