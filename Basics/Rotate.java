class Rotate {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 3;

        int rotations = k % n;
        int rotatedArray[] = new int[n];

        int cnt = n - rotations;

        for (int i = 0; i < rotations; ++i) {
            rotatedArray[i] = arr[cnt++];
        }

        cnt = 0;

        for (int i = rotations; i < n; ++i) {
            rotatedArray[i] = arr[cnt++];
        }

        for (int num : rotatedArray) {
            System.out.println(num);
        }
    }
}