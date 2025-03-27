class HollowNumberPyramid {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int k = 0; k < (i * 2) - 3; k++) {
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print(i);
            }
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println();
            if (i == 4) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(5);
                }
            }
        }
    }
}