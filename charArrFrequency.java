class charArrFrequency {
    static void frequency(String s) {
        char str[] = s.toCharArray();
        int freq[] = new int[s.length()];

        for (int i = 0; i < s.length(); ++i) {
            freq[i] = 1;
            for (int j = i + 1; j < s.length(); ++j) {
                if (str[i] == str[j]) {
                    freq[i]++;
                    str[j] = 0;
                }
            }
        }

        for (int i = 0; i < s.length(); ++i) {
            if (str[i] > 0 && str[i] != ' ') {
                System.out.println(str[i] + " = " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        frequency("helloworld");
    }
}