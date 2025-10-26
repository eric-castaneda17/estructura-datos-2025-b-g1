import java.util.HashMap;

public class TablaHash {
    private static class User {
        String id;
        String name;
        User(String id, String name) {
            this.id = id;
            this.name = name;
        }
        @Override
        public String toString() {
            return id + ": " + name;
        }
    }

    private HashMap<String, User> map;

    public TablaHash() {
        map = new HashMap<>();
    }

    // Añade usuario si no existe 
    public boolean addUser(String id, String name) {
        if (map.containsKey(id)) return false; // ya existe
        map.put(id, new User(id, name));
        return true;
    }

    public User getUser(String id) {
        return map.get(id);
    }

    public boolean removeUser(String id) {
        return map.remove(id) != null;
    }

    public static void main(String[] args) {
        TablaHash users = new TablaHash();
        System.out.println(users.addUser("100", "Carlos")); // true
        System.out.println(users.addUser("100", "María"));  // false (duplicado)
        System.out.println(users.getUser("100"));
    }
}
