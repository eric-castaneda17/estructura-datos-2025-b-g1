public class Ejercicio4 {
    public static void main(String[] args) {
        HashTable<String, Integer> tabla = new HashTable<>(10);

        tabla.put("A", 1);
        tabla.put("B", 2);
        tabla.put("C", 3);
        tabla.put("D", 4);

        System.out.println("Tamaño actual: " + tabla.size());
        tabla.remove("C");
        System.out.println("Tamaño tras eliminar C: " + tabla.size());
        System.out.println("¿Está vacía? " + tabla.isEmpty());
    }
}
