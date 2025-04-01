class BinarySearch {
    static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = (high + low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                low = arr[mid];
            } else if (key < arr[mid]) {
                high = arr[mid];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int key = 2;

        int index = binarySearch(arr, key);
        System.out.println(index);
    }
}