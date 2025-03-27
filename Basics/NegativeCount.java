class NegativeCount {
    public static void main(String args[]) {
        int arr[] = { 1, 2, -3, -4, 5, 6 };

        int cnt = 0;

        for (int n : arr) {
            if (n < 0) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}