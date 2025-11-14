public class Ejercicio1 {
    public static void main(String[] args) {

        Graph redSocial = new Graph();

        // Agregar usuarios
        redSocial.addVertex("Ana");
        redSocial.addVertex("Luis");
        redSocial.addVertex("Maria");
        redSocial.addVertex("Pedro");
        redSocial.addVertex("Sofia");

        // Agregar amistades (aristas)
        redSocial.addEdge("Ana", "Luis");
        redSocial.addEdge("Ana", "Maria");
        redSocial.addEdge("Luis", "Pedro");
        redSocial.addEdge("Maria", "Sofia");

        System.out.println("=== Red Social ===");
        System.out.println("Recorrido BFS desde Ana:");
        System.out.println(redSocial.bfs("Ana"));
    }
}
