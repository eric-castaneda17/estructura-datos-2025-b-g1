
public class ArbolAVL {
    static class Node {
        int key, height;
        Node left, right;
        Node(int k) { key = k; height = 1; }
    }

    private Node root;

    private int height(Node n) { return n == null ? 0 : n.height; }

    private int getBalance(Node n) { return n == null ? 0 : height(n.left) - height(n.right); }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        System.out.println("Rotación derecha en nodo " + y.key);
        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        System.out.println("Rotación izquierda en nodo " + x.key);
        return y;
    }

    public void insert(int key) { root = insertRec(root, key); }

    private Node insertRec(Node node, int key) {
        if (node == null) return new Node(key);
        if (key < node.key) node.left = insertRec(node.left, key);
        else if (key > node.key) node.right = insertRec(node.right, key);
        else return node; 

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);
        
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);
        
        if (balance > 1 && key > node.left.key) {
            System.out.println("Rotación doble (izquierda-derecha) en nodo " + node.key);
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        
        if (balance < -1 && key < node.right.key) {
            System.out.println("Rotación doble (derecha-izquierda) en nodo " + node.key);
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    // Inorden para ver la estructura
    public void inorder() { inorderRec(root); System.out.println(); }
    private void inorderRec(Node node) {
        if (node == null) return;
        inorderRec(node.left);
        System.out.print(node.key + " ");
        inorderRec(node.right);
    }

    public static void main(String[] args) {
        ArbolAVL tree = new ArbolAVL();
        int[] values = {30, 20, 40, 10, 25, 5}; 
        for (int v : values) {
            System.out.println("Insertando " + v);
            tree.insert(v);
        }
        System.out.print("Inorden AVL: ");
        tree.inorder();
    }
}
