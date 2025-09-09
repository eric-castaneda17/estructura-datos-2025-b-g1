
public class Ejercicio1 {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        // Insertamos algunos elementos al final
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        lista.insertarFinal(40);

        // Mostramos los elementos de la lista
        System.out.println("Contenido de la lista:");
        lista.mostrarLista();
    }
}
