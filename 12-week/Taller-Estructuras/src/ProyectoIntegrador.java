import java.util.*;

public class ProyectoIntegrador {
    // Representación del grafo 
    private Map<String, List<String>> grafo;
    // Pila para guardar el historial de movimientos
    private Stack<String> pilaMovimientos;
    // Ciudad actual
    private String ciudadActual;

    public ProyectoIntegrador() {
        grafo = new HashMap<>();
        pilaMovimientos = new Stack<>();
        crearMapa();
        ciudadActual = "A"; // punto inicial
        pilaMovimientos.push(ciudadActual);
    }

    // Crea un grafo simple con algunas conexiones
    private void crearMapa() {
        grafo.put("A", Arrays.asList("B", "C"));
        grafo.put("B", Arrays.asList("A", "D", "E"));
        grafo.put("C", Arrays.asList("A", "F"));
        grafo.put("D", Arrays.asList("B"));
        grafo.put("E", Arrays.asList("B", "F"));
        grafo.put("F", Arrays.asList("C", "E"));
    }

    // Moverse a una ciudad conectada
    public void mover(String destino) {
        List<String> vecinos = grafo.get(ciudadActual);
        if (vecinos != null && vecinos.contains(destino)) {
            ciudadActual = destino;
            pilaMovimientos.push(ciudadActual);
            System.out.println("Te moviste a la ciudad " + ciudadActual);
        } else {
            System.out.println("No puedes ir de " + ciudadActual + " a " + destino);
        }
    }

    // Deshacer el último movimiento
    public void deshacer() {
        if (pilaMovimientos.size() > 1) {
            pilaMovimientos.pop();
            ciudadActual = pilaMovimientos.peek();
            System.out.println("Deshiciste el último movimiento. Ahora estás en " + ciudadActual);
        } else {
            System.out.println("No hay movimientos para deshacer.");
        }
    }

    // Mostrar ciudades disponibles desde la actual
    public void mostrarOpciones() {
        System.out.println("Desde " + ciudadActual + " puedes ir a: " + grafo.get(ciudadActual));
    }

    // Ejecutar una simulación de recorrido
    public static void main(String[] args) {
        ProyectoIntegrador sim = new ProyectoIntegrador();

        System.out.println("=== Simulación de recorrido de ciudades con pila ===");
        sim.mostrarOpciones();
        sim.mover("B");
        sim.mostrarOpciones();
        sim.mover("E");
        sim.mostrarOpciones();
        sim.mover("F");

        System.out.println("\nHistorial de movimientos: " + sim.pilaMovimientos);
        sim.deshacer();
        sim.deshacer();
        System.out.println("Ubicación final: " + sim.ciudadActual);
        System.out.println("Historial final: " + sim.pilaMovimientos);
    }
}
