public class Ejercicio3 {
    public static void main(String[] args) {
        HashTable<Integer, String> tabla = new HashTable<>(5);

        tabla.put(1, "Uno");
        tabla.put(6, "Seis"); // misma posición que 1 si 6 % 5 == 1
        tabla.put(11, "Once"); // misma posición que 1 y 6

        System.out.println("Colisiones resueltas por encadenamiento:");
        System.out.println("1 → " + tabla.get(1));
        System.out.println("6 → " + tabla.get(6));
        System.out.println("11 → " + tabla.get(11));
    }
}
