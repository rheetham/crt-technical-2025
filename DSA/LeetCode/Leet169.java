class Leet169 {
    static public int majorityElement(int[] nums) {
        int freq = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (freq == 0) {
                result = nums[i];
            }
            if (result == nums[i]) {
                freq++;
            } else {
                freq--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 3, 2, 3, 1, 1 };
        System.out.println(majorityElement(arr));
    }
}