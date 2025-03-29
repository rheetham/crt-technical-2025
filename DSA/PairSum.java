class PairSum {
    static void findPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int result = arr[left] + arr[right];
            if (result == target) {
                System.out.println("Pair is at" + left + "," + right);
            }
            if (result < target) {
                left++;
            } else {
                right--;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 9, 2 };
        findPair(arr, 7);
    }
}