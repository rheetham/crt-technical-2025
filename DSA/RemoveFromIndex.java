class RemoveFromIndex {
    static int[] leftShift(int arr[], int n) {
        int newArr[] = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; ++i) {
            if (i == n)
                continue;
            newArr[j++] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int index = 2;
        int newArr[] = leftShift(arr, index);

        for (int k : newArr) {
            System.out.println(k);
        }
    }
}