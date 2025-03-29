class Leet11 {
    public int maxArea(int height[]) {
        int max = 0;
        int low = 0;
        int high = height.length - 1;

        while (low < high) {
            int smallerHeight = height[low] < height[high] ? height[low] : height[high];
            int area = smallerHeight * (high - low);
            if (max < area) {
                max = area;
            }
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }

        return max;
    }
}