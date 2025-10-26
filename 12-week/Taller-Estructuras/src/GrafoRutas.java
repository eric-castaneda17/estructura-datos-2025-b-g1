import java.util.*;

public class GrafoRutas {
    private int V;
    private List<List<Edge>> adj;

    private static class Edge {
        int to;
        int weight;
        Edge(int t, int w) { to = t; weight = w; }
    }

    public GrafoRutas(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
    }

    // Añadir arista 
    public void addEdge(int u, int v, int w) {
        adj.get(u).add(new Edge(v, w));
        adj.get(v).add(new Edge(u, w)); 
    }

    public int[] dijkstra(int s) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{s, 0});

        boolean[] visited = new boolean[V];

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int u = cur[0];
            if (visited[u]) continue;
            visited[u] = true;

            for (Edge e : adj.get(u)) {
                int v = e.to;
                int w = e.weight;
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new int[]{v, dist[v]});
                }
            }
        }
        return dist; // distancia mínima desde s a cada nodo 
    }

    public static void main(String[] args) {
        // Ejemplo con 5 ciudades
        GrafoRutas g = new GrafoRutas(5);
        g.addEdge(0,1,2);
        g.addEdge(0,2,5);
        g.addEdge(1,2,1);
        g.addEdge(1,3,2);
        g.addEdge(2,3,3);
        g.addEdge(3,4,1);

        int source = 0;
        int[] distances = g.dijkstra(source);
        System.out.println("Distancias desde " + source + ": " + Arrays.toString(distances));
    }
}
