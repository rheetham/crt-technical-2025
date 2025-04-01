import java.util.Arrays;

class MajorityElem {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 1, 1, 1, 2 };
        Arrays.sort(arr);
        int majElem = arr[arr.length / 2];

        System.out.println(majElem);
    }
}