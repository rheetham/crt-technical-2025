class Loops {
    static void basicFor() {
        int n = 10;
        for (int i = 1; i <= n; ++i) {
            System.out.println(i);
        }
        System.out.println();
    }

    static void reverseFor() {
        int n = 10;
        for (int i = n; i >= 1; --i) {
            System.out.println(i);
        }
        System.out.println();
    }

    static void tables() {
        int n = 10;
        for (int i = 1; i <= 10; ++i) {
            System.out.println(i * n);
        }
        System.out.println();
    }

    static void squares() {
        int n = 10;
        for (int i = 1; i <= n; ++i) {
            System.out.println(i * i);
        }
        System.out.println();
    }

    static void is_even() {
        int n = 10;
        for (int i = 1; i <= n; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        basicFor();
        reverseFor();
        tables();
        squares();
        is_even();
    }
}