class Test {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push("meow");
        s.push(3);
        System.out.println(s.peek());
        System.out.println(s.search("meow"));
    }
}