
public class ListaDoble {
    NodoDoble cabeza;
    NodoDoble cola; // puntero al último nodo

    public ListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    // Insertar al inicio
    public void insertarInicio(int valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
            cabeza = nuevo;
        }
    }

    // Insertar al final
    public void insertarFinal(int valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    // Eliminar al inicio
    public void eliminarInicio() {
        if (cabeza == null) {
            System.out.println(" La lista está vacía.");
            return;
        }
        if (cabeza == cola) { // un solo elemento
            cabeza = cola = null;
        } else {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
        }
    }

    // Eliminar al final
    public void eliminarFinal() {
        if (cola == null) {
            System.out.println(" La lista está vacía.");
            return;
        }
        if (cabeza == cola) { // un solo elemento
            cabeza = cola = null;
        } else {
            cola = cola.anterior;
            cola.siguiente = null;
        }
    }

    // Mostrar lista hacia adelante
    public void mostrarAdelante() {
        NodoDoble temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " <-> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }

    // Mostrar lista hacia atrás
    public void mostrarAtras() {
        NodoDoble temp = cola;
        while (temp != null) {
            System.out.print(temp.dato + " <-> ");
            temp = temp.anterior;
        }
        System.out.println("null");
    }
}
