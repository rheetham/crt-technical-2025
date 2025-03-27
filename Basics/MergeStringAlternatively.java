public class MergeStringAlternatively {
    static void alternative(char[] s1, char[] s2, int s1_len, int s2_len) {
        String s3 = "";

        for (int i = 0; i < s1_len || i < s2_len; i++) {
            if (i < s1_len) {
                s3 = s3.concat("" + s1[i]);
            }
            if (i < s2_len) {
                s3 = s3.concat("" + s2[i]);
            }
        }
        System.out.println(s3);
    }

    public static void main(String[] args) {
        char[] s1 = { 'a', 'b', 'c', 'd', 'e' };
        char[] s2 = { 'x', 'y', 'z' };
        alternative(s1, s2, s1.length, s2.length);
    }
}