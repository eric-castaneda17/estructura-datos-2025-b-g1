
public class ArbolBusqueda {
    static class Node {
        int key;
        Node left, right;
        Node(int k) { key = k; }
    }

    private Node root;

    public void insert(int key) { root = insertRec(root, key); }
    private Node insertRec(Node node, int key) {
        if (node == null) return new Node(key);
        if (key < node.key) node.left = insertRec(node.left, key);
        else if (key > node.key) node.right = insertRec(node.right, key);
        // duplicados ignorados
        return node;
    }

    public boolean search(int key) { return searchRec(root, key); }
    private boolean searchRec(Node node, int key) {
        if (node == null) return false;
        if (key == node.key) return true;
        return key < node.key ? searchRec(node.left, key) : searchRec(node.right, key);
    }

    public void delete(int key) { root = deleteRec(root, key); }
    private Node deleteRec(Node node, int key) {
        if (node == null) return null;
        if (key < node.key) node.left = deleteRec(node.left, key);
        else if (key > node.key) node.right = deleteRec(node.right, key);
        else {
            // caso 1 y 2: nodo con 0 o 1 hijo
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;
            // caso 3: dos hijos -> obtener sucesor inorden (mínimo en subárbol derecho)
            node.key = minValue(node.right);
            node.right = deleteRec(node.right, node.key);
        }
        return node;
    }

    private int minValue(Node node) {
        int minv = node.key;
        while (node.left != null) {
            minv = node.left.key;
            node = node.left;
        }
        return minv;
    }

    // recorrido inorden 
    public void inorder() { inorderRec(root); System.out.println(); }
    private void inorderRec(Node node) {
        if (node == null) return;
        inorderRec(node.left);
        System.out.print(node.key + " ");
        inorderRec(node.right);
    }

    public static void main(String[] args) {
        ArbolBusqueda tree = new ArbolBusqueda();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(60);
        System.out.print("Inorden: "); tree.inorder();
        System.out.println("Buscar 60: " + tree.search(60));
        tree.delete(50);
        System.out.print("Inorden tras borrar 50: "); tree.inorder();
    }
}
