class Leet169 {
    static public int majorityElement(int[] nums) {
        int freq = 1;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (freq == 1) {
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
        int arr[] = { 3, 2, 3, 2, 2, 3, 3 };
        System.out.println(majorityElement(arr));
    }
}