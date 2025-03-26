class SpiralMatrix {
    static void spiralTraversal(int mat[][], int width, int row, int col) {
        if (col == mat[0].length - 1) {
            return;
        }
        System.out.println(mat[row][++col]);
        int wid = 0;
        while (wid < width) {
            System.out.println(mat[++row][col]);
            wid++;
        }
        wid = 0;
        width += 1;
        while (wid < width) {
            System.out.println(mat[row][--col]);
            wid++;
        }
        wid = 0;
        while (wid < width) {
            System.out.println(mat[--row][col]);
            wid++;
        }
        wid = 0;
        while (wid < width) {
            System.out.println(mat[row][++col]);
            wid++;
        }
        spiralTraversal(mat, width + 1, row, col);
    }

    public static void main(String args[]) {
        int mat[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };
        int mid = mat.length / 2;
        System.out.println(mat[mid][mid]);
        spiralTraversal(mat, 1, mid, mid);
    }
}