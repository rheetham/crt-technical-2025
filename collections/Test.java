class Test {
    public static void main(String[] args) {
        BinarySearchTree s = new BinarySearchTree();
        s.insert(50);
        s.insert(40);
        s.insert(30);
        s.insert(60);
        s.insert(10);
        s.inOrder();
        s.preOrder();
        s.postOrder();
    }
}