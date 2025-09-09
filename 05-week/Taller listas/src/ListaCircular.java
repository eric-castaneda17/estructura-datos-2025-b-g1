
public class ListaCircular {
    NodoCircular cabeza;

    public ListaCircular() {
        this.cabeza = null;
    }

    // Insertar al final
    public void insertarFinal(int valor) {
        NodoCircular nuevo = new NodoCircular(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza; // apunta a sí mismo
        } else {
            NodoCircular temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    // Insertar en posición (0 = inicio)
    public void insertarPosicion(int valor, int posicion) {
        if (posicion < 0) {
            System.out.println(" Posición inválida.");
            return;
        }

        NodoCircular nuevo = new NodoCircular(valor);

        // Insertar en cabeza
        if (posicion == 0) {
            if (cabeza == null) {
                cabeza = nuevo;
                cabeza.siguiente = cabeza;
            } else {
                NodoCircular temp = cabeza;
                while (temp.siguiente != cabeza) {
                    temp = temp.siguiente;
                }
                nuevo.siguiente = cabeza;
                temp.siguiente = nuevo;
                cabeza = nuevo;
            }
            return;
        }

        NodoCircular temp = cabeza;
        int contador = 0;

        while (contador < posicion - 1 && temp.siguiente != cabeza) {
            temp = temp.siguiente;
            contador++;
        }

        if (contador != posicion - 1) {
            System.out.println(" Posición fuera de rango.");
        } else {
            nuevo.siguiente = temp.siguiente;
            temp.siguiente = nuevo;
        }
    }

    // Eliminar en posición
    public void eliminarPosicion(int posicion) {
        if (cabeza == null) {
            System.out.println(" La lista está vacía.");
            return;
        }

        if (posicion < 0) {
            System.out.println(" Posición inválida.");
            return;
        }

        // Caso especial: eliminar cabeza
        if (posicion == 0) {
            if (cabeza.siguiente == cabeza) {
                cabeza = null; // solo un nodo
            } else {
                NodoCircular temp = cabeza;
                while (temp.siguiente != cabeza) {
                    temp = temp.siguiente;
                }
                temp.siguiente = cabeza.siguiente;
                cabeza = cabeza.siguiente;
            }
            return;
        }

        NodoCircular temp = cabeza;
        int contador = 0;

        while (contador < posicion - 1 && temp.siguiente != cabeza) {
            temp = temp.siguiente;
            contador++;
        }

        if (temp.siguiente == cabeza || contador != posicion - 1) {
            System.out.println(" Posición fuera de rango.");
        } else {
            temp.siguiente = temp.siguiente.siguiente;
        }
    }

    // Mostrar lista circular
    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        NodoCircular temp = cabeza;
        do {
            System.out.print(temp.dato + " -> ");
            temp = temp.siguiente;
        } while (temp != cabeza);
        System.out.println("(vuelve al inicio)");
    }
}
