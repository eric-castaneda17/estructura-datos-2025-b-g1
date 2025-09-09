
public class ListaSimple {
    Nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    // Insertar al inicio
    public void insertarInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    // Insertar al final
    public void insertarFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    // Insertar en una posición específica (0 = inicio)
    public void insertarPosicion(int valor, int posicion) {
        if (posicion < 0) {
            System.out.println(" Posición inválida.");
            return;
        }

        // Caso especial: insertar al inicio
        if (posicion == 0) {
            insertarInicio(valor);
            return;
        }

        Nodo temp = cabeza;
        int contador = 0;

        // Avanzamos hasta el nodo anterior a la posición
        while (temp != null && contador < posicion - 1) {
            temp = temp.siguiente;
            contador++;
        }

        if (temp == null) {
            System.out.println(" Posición fuera de rango.");
        } else {
            Nodo nuevo = new Nodo(valor);
            nuevo.siguiente = temp.siguiente;
            temp.siguiente = nuevo;
        }
    }

    // Mostrar lista
    public void mostrarLista() {
        Nodo temp = cabeza;
        if (temp == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
    // Eliminar nodo en una posición específica
public void eliminarPosicion(int posicion) {
    if (cabeza == null) {
        System.out.println(" La lista está vacía.");
        return;
    }

    if (posicion < 0) {
        System.out.println(" Posición inválida.");
        return;
    }

    // Caso especial: eliminar el primer nodo
    if (posicion == 0) {
        cabeza = cabeza.siguiente;
        return;
    }

    Nodo temp = cabeza;
    int contador = 0;

    // Avanzamos hasta el nodo anterior al que queremos eliminar
    while (temp != null && contador < posicion - 1) {
        temp = temp.siguiente;
        contador++;
    }

    // Si llegamos al final o la posición no existe
    if (temp == null || temp.siguiente == null) {
        System.out.println(" Posición fuera de rango.");
    } else {
        temp.siguiente = temp.siguiente.siguiente;
    }
}


}
