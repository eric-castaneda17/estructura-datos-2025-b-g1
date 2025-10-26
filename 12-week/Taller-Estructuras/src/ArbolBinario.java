
public class ArbolBinario {
    static class Node {
        int value;
        Node left, right;
        Node(int v) { value = v; }
    }

    // Recorrido preorden: Root, Left, Right
    public static void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Recorrido inorden: Left, Root, Right
    public static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    // Recorrido postorden: Left, Right, Root
    public static void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
      
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);

        System.out.print("Preorden: "); preorder(root); System.out.println();
        System.out.print("Inorden: "); inorder(root); System.out.println();
        System.out.print("Postorden: "); postorder(root); System.out.println();
    }
}
