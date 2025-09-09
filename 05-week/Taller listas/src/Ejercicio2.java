
public class Ejercicio2 {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        // Insertamos al final algunos valores
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(40);

        System.out.println("Lista inicial:");
        lista.mostrarLista();

        // Insertar en posición 0 (inicio)
        lista.insertarPosicion(5, 0);
        System.out.println("Después de insertar 5 en posición 0:");
        lista.mostrarLista();

        // Insertar en posición 2 (en medio)
        lista.insertarPosicion(15, 2);
        System.out.println("Después de insertar 15 en posición 2:");
        lista.mostrarLista();

        // Insertar en una posición fuera de rango
        lista.insertarPosicion(100, 10); // Error controlado
    }
}
