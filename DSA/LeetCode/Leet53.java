class Leet53 {
    static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;

        if (nums.length == 1) {
            return max;
        }

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 2, 3, -1, 6, 1 };
        System.out.println(maxSubArray(arr));
    }
}