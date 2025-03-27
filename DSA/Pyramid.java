class Pyramid {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((i * 2) - 1); k++) {
                if (k == 1 || k == (i * 2) - 1)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 9; ++i) {
            System.out.print(5);
        }
    }
}