
public class ListaEspera {
    Paciente cabeza; // primero en la fila
    Paciente cola;   // último en la fila

    public ListaEspera() {
        this.cabeza = null;
        this.cola = null;
    }

    // Ingresar paciente (al final de la cola)
    public void ingresarPaciente(String nombre) {
        Paciente nuevo = new Paciente(nombre);
        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
        }
        System.out.println(" Paciente ingresado: " + nombre);
    }

    // Atender paciente (eliminar al inicio)
    public void atenderPaciente() {
        if (cabeza == null) {
            System.out.println(" No hay pacientes en espera.");
            return;
        }
        System.out.println(" Atendiendo a: " + cabeza.nombre);
        cabeza = cabeza.siguiente;
        if (cabeza == null) { // si la cola quedó vacía
            cola = null;
        }
    }

    // Mostrar lista de espera
    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("La lista de espera está vacía.");
            return;
        }
        System.out.println(" Lista de espera:");
        Paciente temp = cabeza;
        while (temp != null) {
            System.out.print(temp.nombre + " -> ");
            temp = temp.siguiente;
        }
        System.out.println("null");
    }
}
