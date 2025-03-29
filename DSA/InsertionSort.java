class InsertionSort {

    // check if previous index element is smaller
    // keep swapping if previous elements are bigger

    static void sort(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i - 1] < arr[i])
                continue;

            int key = i;
            for (int j = i - 1; j >= 0; --j) {
                if (arr[j] > arr[key]) {
                    int temp = arr[j];
                    arr[j] = arr[key];
                    arr[key] = temp;
                    key--;
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