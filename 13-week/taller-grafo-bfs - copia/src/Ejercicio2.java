public class Ejercicio2 {
    public static void main(String[] args) {

        Graph mapa = new Graph();

        // Agregar ciudades
        mapa.addVertex("Bogota");
        mapa.addVertex("Medellin");
        mapa.addVertex("Cali");
        mapa.addVertex("Barranquilla");
        mapa.addVertex("Cartagena");
        mapa.addVertex("Bucaramanga");

        // Conexiones entre ciudades (carreteras)
        mapa.addEdge("Bogota", "Medellin");
        mapa.addEdge("Bogota", "Cali");
        mapa.addEdge("Medellin", "Barranquilla");
        mapa.addEdge("Cali", "Cartagena");
        mapa.addEdge("Barranquilla", "Cartagena");
        mapa.addEdge("Cartagena", "Bucaramanga");

        System.out.println("=== Mapa de Ciudades ===");
        System.out.println("Recorrido BFS desde Bogota:");
        System.out.println(mapa.bfs("Bogota"));
    }
}
