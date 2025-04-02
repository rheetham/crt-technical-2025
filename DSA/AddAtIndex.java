class AddAtIndex {
    static int[] rightShift(int arr[], int n, int target) {
        int newArr[] = new int[arr.length + 1];

        for (int i = 0; i < n; ++i) {
            newArr[i] = arr[i];
        }

        for (int i = n + 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        newArr[n] = target;

        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int num = 0;

        int index = 2;

        int newArr[] = rightShift(arr, index, num);

        for (int k : newArr) {
            System.out.println(k);
        }
    }
}