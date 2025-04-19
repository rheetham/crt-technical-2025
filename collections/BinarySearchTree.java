public class BinarySearchTree {
    class Node {
        int data;
        Node Left;
        Node Right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node currRoot, int data) {
        if (currRoot == null) {
            currRoot = new Node(data);
            return currRoot;
        }
        if (currRoot.data > data) {
            currRoot.Left = insertRec(currRoot.Left, data);
        } else {
            currRoot.Right = insertRec(currRoot.Right, data);
        }
        return currRoot;
    }

    public void inOrder() {
        displayInorder(root);
    }

    public void preOrder() {
        displayPreorder(root);
    }

    public void postOrder() {
        displayPostorder(root);
    }

    public void displayInorder(Node root) {
        if (root == null)
            return;
        displayInorder(root.Left);
        System.out.println(root.data);
        displayInorder(root.Right);
    }

    public void displayPostorder(Node root) {
        if (root == null)
            return;
        displayPostorder(root.Left);
        displayPostorder(root.Right);
        System.out.println(root.data);
    }

    public void displayPreorder(Node root) {
        if (root == null)
            return;
        System.out.println(root.data);
        displayPreorder(root.Left);
        displayPreorder(root.Right);
    }
}