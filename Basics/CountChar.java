public class CountChar {
    static void CharCount(String s) {
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            char currChar = s.charAt(i);
            if (currChar == s.charAt(i + 1)) {
                count++;
            } else if (count == 1) {
                System.out.print(s.charAt(i));
                count = 1;
            } else {
                System.out.print(s.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }
        System.out.print(s.charAt(s.length() - 1));
        System.out.print(count);
    }

    public static void main(String[] args) {
        CharCount("aaabbbbbbddddddccccceeeeeeeeeeeeoooooooooooooooooooo");
    }
}