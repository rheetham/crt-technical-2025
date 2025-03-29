class InsertionSort {

    // check if previous index element is smaller
    // keep swapping if previous elements are bigger

    static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = i + 1; j > 0; --j) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 6, 4, 11, 4, 3, 12, 6 };
        sort(arr);
    }
}