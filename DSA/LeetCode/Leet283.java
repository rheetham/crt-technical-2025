class Leet283 {
    static void moveZeroes(int[] nums) {
        int index = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
                continue;
            }
            nums[index++] = nums[i];
        }

        for (int i = nums.length - count; i < nums.length; ++i) {
            nums[i] = 0;
        }

        for (int n : nums) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 3, 4 };
        moveZeroes(arr);
    }
}