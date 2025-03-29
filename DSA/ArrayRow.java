class ArrayRow {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr[0].length; i++) {
            int currSum = 0;
            for (int j = 0; j < arr.length; j++) {
                currSum += arr[i][j];

            }
            if (currSum > maxSum) {
                maxSum = currSum;

            }
        }
        System.out.println(maxSum);
    }
}