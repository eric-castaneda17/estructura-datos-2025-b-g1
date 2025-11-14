public class Ejercicio3 {
    public static void main(String[] args) {

        Graph g = new Graph();

        // Componente 1
        g.addEdge("A", "B");
        g.addEdge("B", "C");

        // Componente 2
        g.addEdge("X", "Y");

        // Componente 3 (nodo aislado)
        g.addVertex("Z");

        System.out.println("=== Componentes Conexos ===");

        System.out.println("BFS desde A:");
        System.out.println(g.bfs("A"));  // A, B, C

        System.out.println("BFS desde X:");
        System.out.println(g.bfs("X"));  // X, Y

        System.out.println("BFS desde Z:");
        System.out.println(g.bfs("Z"));  // Z (solo él)
    }
}
