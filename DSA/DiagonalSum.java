class DiagonalSum {
    public static void main(String[] args) {
        int marrix[][] = { { 1, 3, 1 }, { 1, 2, 1 }, { 1, 1, 3 } };
        int primaryDiagonal = 0;
        for (int i = 0; i < marrix.length; i++) {
            primaryDiagonal += marrix[i][i];
        }
        int row = 0;
        int col = marrix[0].length - 1;
        int secondaryDiagonal = 0;
        for (int i = 0; i < marrix.length; i++) {
            secondaryDiagonal += marrix[row++][col--];
        }
        int midElem = marrix[marrix.length / 2][marrix.length / 2];
        System.out.println(primaryDiagonal + secondaryDiagonal - midElem);
    }

}