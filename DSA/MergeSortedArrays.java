import java.util.Arrays;

class MergeSortedArrays {
    public static void main(String args[]) {
        int arr1[] = { 1, 2, 7, 9 };
        int arr2[] = { 3, 5, 7, 15 };
        int sorted[] = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; ++i) {
            sorted[i] = arr1[i];
        }

        for (int i = 0, j = arr1.length; i < arr2.length; ++i, ++j) {
            sorted[j] = arr2[i];
        }

        Arrays.sort(sorted);

        for (int n : sorted) {
            System.out.println(n);
        }
    }
}