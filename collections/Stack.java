class Stack {
    private Object arr[];
    private int top;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    Stack() {
        arr = new Object[DEFAULT_CAPACITY];
        top = -1;
        size = 0;
    }

    public void push(Object obj) {
        if (size == arr.length) {
            resize();
        }

        arr[++top] = obj;
        ++size;
    }

    public Object pop() {
        if (top >= 0) {
            Object poppedElement = arr[top];
            arr[top--] = null;
            return poppedElement;
        }

        System.out.println("Stack is empty");
        return null;
    }

    public Object peek() {
        if (top >= 0) {
            return arr[top];
        }

        System.out.println("Stack is empty");
        return null;
    }

    public int search(Object obj) {
        for (int i = 0; i < size; ++i) {
            if (arr[i] == obj) {
                return size - i;
            }
        }

        System.out.println("Element not found");
        return -1;
    }

    public void resize() {
        Object newArr[] = new Object[size * 2];

        for (int i = 0; i < size; ++i) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}