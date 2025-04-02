class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }

    void display() {
        System.out.println(this.value);
        System.out.println(this.next);
    }
}

class LinkedList {
    public static void main(String[] args) {
        Node listNode = new Node(5);
        listNode.display();
    }
}
