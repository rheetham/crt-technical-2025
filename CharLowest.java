public class CharLowest {
    public static void main(String[] args) {
        homelander("Danishh");
    }

    static void homelander(String s) {
        int count[] = new int[130];
        for (int i = 0; i < s.length(); i++) {
            ++count[s.charAt(i)];
        }
        int lowest = Integer.MAX_VALUE;
        char lowChar = 'z';
        for (int i = 'A'; i < count.length; i++) {
            if (count[i] < lowest && count[i] > 0) {
                lowChar = (char) i;
                lowest = count[i];
            }
        }
        System.out.println(lowChar + " " + lowest);
    }
}