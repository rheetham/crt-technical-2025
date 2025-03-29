class StringPalindrome {
    static boolean isPali(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(r) != s.charAt(l)) {
                return false;

            }
            l++;
            r--;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPali("mom"));
    }
}