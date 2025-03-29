class SelectionSort {

    // Find the minimum in the array from current index (j -> arr.length)
    // swap with the current unsorted index (i -> arr.length)

    static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minElement = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minElement] > nums[j]) {
                    minElement = j;

                }
            }
            int temp = 0;
            temp = nums[i];
            nums[i] = nums[minElement];
            nums[minElement] = temp;
        }

        for (int i : nums) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 6, 4, 11, 4, 3, 12, 6 };
        sort(arr);
    }
}