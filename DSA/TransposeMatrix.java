class TransposeMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int t[][] = new int[3][3];

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                t[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.print(t[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}