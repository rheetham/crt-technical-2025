import java.io.*;

class CountOccurences {
    public static void main(String args[]) {
        int n = 7;
        int arr[] = new int[n];
        int freq = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < n; ++i) {
            try {
                String num = br.readLine();
                arr[i] = Integer.parseInt(num);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n - 1; ++i) {
            if (arr[i] == arr[i + 1]) {
                ++freq;
            } else {
                System.out.println(arr[i] + " : " + freq);
                freq = 1;
            }
        }

        System.out.println(arr[n - 1] + " : " + freq);
    }
}