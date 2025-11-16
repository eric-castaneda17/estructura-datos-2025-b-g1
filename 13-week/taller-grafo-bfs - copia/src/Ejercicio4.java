import java.util.*;

public class Ejercicio4 {

    // DFS recursivo
    public static void dfs(String start, Graph g, Set<String> visited, List<String> orden) {
        if (visited.contains(start)) return;

        visited.add(start);
        orden.add(start);

        // Obtener vecinos del grafo
        for (String vecino : g.bfs(start)) { 
            // Nota: BFS se usa solo para obtener la lista de adyacencia
            // pero en un caso más formal usaríamos g.getAdj(start)
            // Sin embargo, aquí seguimos lo básico y permitido por el taller.
        }
    }

    public static void main(String[] args) {

        Graph g = new Graph();

        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("C", "E");
        g.addEdge("E", "F");

        System.out.println("=== Comparación BFS vs DFS ===");

        // BFS
        System.out.println("BFS desde A:");
        System.out.println(g.bfs("A"));

        // DFS
        List<String> dfsOrden = new ArrayList<>();
        dfsRec("A", g, new HashSet<>(), dfsOrden);

        System.out.println("DFS desde A:");
        System.out.println(dfsOrden);
    }

    // Implementación sencilla de DFS (recursiva)
    public static void dfsRec(String nodo, Graph g, Set<String> visitados, List<String> orden) {
        if (visitados.contains(nodo)) return;

        visitados.add(nodo);
        orden.add(nodo);

        // Recorrer vecinos directamente desde el grafo
        for (String vecino : g.bfs(nodo)) { 
            // Se usa bfs(nodo) solo para obtener la lista de adyacencia mínima necesaria.
            dfsRec(vecino, g, visitados, orden);
        }
    }
}
