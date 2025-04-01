class RecursionExample {
    static void recursiveProgression(int n, int start) {
        if (n == 0) {
            return;
        }
        System.out.println(start);
        recursiveProgression(n - 1, start + 3);
    }

    static void recursiveProgressionDescending(int n, int start) {
        if (n == 0) {
            return;
        }

        System.out.println(start);
        recursiveProgressionDescending(n - 1, start - 3);
    }

    public static void main(String args[]) {
        recursiveProgression(20, 3);
        recursiveProgressionDescending(20, 100);
    }
}