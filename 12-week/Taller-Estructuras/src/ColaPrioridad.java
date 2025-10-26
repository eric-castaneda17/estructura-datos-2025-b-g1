import java.util.PriorityQueue;

public class ColaPrioridad {
    private static class Client implements Comparable<Client> {
        String name;
        int priority;

        Client(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        // Orden por prioridad (menor valor = mayor prioridad)
        @Override
        public int compareTo(Client other) {
            return Integer.compare(this.priority, other.priority);
        }

        @Override
        public String toString() {
            return name + " (prioridad " + priority + ")";
        }
    }

    private PriorityQueue<Client> queue;

    public ColaPrioridad() {
        queue = new PriorityQueue<>();
    }

    public void addClient(String name, int priority) {
        queue.add(new Client(name, priority));
    }

    public Client attendNext() {
        return queue.poll(); 
    }

    public static void main(String[] args) {
        ColaPrioridad system = new ColaPrioridad();
        system.addClient("Ana", 2);
        system.addClient("Juan", 1);
        system.addClient("Pedro", 3);
        System.out.println("Atendiendo: " + system.attendNext()); 
    }
}
