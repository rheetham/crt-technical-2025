class MyArrayList {
    private Object arr[];
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    MyArrayList() {
        arr = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(Object obj) {
        if (size == arr.length) {
            resize();
        }
        arr[size++] = obj;
    }

    public void add(int index, Object obj) {
        if (size == arr.length) {
            resize();
        }

        Object newArr[] = new Object[size++];

        for (int i = 0, j = 0; i < size; ++i) {
            if (i == index && index >= 0 && index <= size) {
                newArr[j++] = obj;
                continue;
            }
            newArr[i] = arr[j++];
        }
        arr = newArr;
    }

    public boolean contains(Object obj) {
        for (int i = 0; i < size; ++i) {
            if (arr[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public void resize() {
        Object newArr[] = new Object[arr.length * 2];

        for (int i = 0; i < arr.length; ++i) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }
}

class ArrayListImplementation {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2, 0);
        list.display();
    }
}
