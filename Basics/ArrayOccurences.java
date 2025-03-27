public class ArrayOccurences {
    static void OiHughie(int[] arr) {
        int count[] = new int[1000];

        for (int i = 0; i < arr.length; ++i) {
            ++count[arr[i]];
        }

        for (int i = 0; i < count.length; ++i) {
            if (count[i] > 0) {
                System.out.print(i + " occurs ");
                System.out.print(count[i] + " times");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 11, 21, 32, 32, 32, 3, 23, 2, 4, 1, 2, 3, 4, 1, 2, 3, 4, 5, 3, 2, 1, 1, 3, 3, 3, 3, 2, 3, 66, 2 };
        OiHughie(arr);
    }
}