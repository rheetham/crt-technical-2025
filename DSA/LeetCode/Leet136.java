class Leet136 {
    static int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int lone = 0;
        for (int n : nums) {
            lone ^= n;
        }
        return lone;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 2, 1 };
        System.out.println(singleNumber(arr));
    }
}