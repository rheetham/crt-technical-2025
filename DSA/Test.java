class Test {
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j > 0; --j) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 3, 3, 4, 1, 3, 12 };
        insertionSort(arr);
    }
}
