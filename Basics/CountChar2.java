public class CountChar2 {
    static void printChar(String s) {
        for (int i = 0; i < s.length() - 1; ++i) {
            if (Character.isDigit(s.charAt(i)))
                continue;

            if (!Character.isDigit(s.charAt(i + 1)) && s.charAt(i) != s.charAt(i + 1))
                System.out.print(s.charAt(i));

            else if (Character.isDigit(s.charAt(i + 1))) {
                int len = s.charAt(i + 1) - '0';
                for (int j = 0; j < len; ++j) {
                    System.out.print(s.charAt(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        printChar("ab6s4");
    }
}