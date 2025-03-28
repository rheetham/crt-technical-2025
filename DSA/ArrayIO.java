import java.io.BufferedReader;
import java.io.InputStreamReader;

class ArrayIO {

    public static void main(String[] args) {

        int arr[] = new int[5];
        int sum = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < arr.length; i++) {
            try {
                String num = br.readLine();
                arr[i] = Integer.parseInt(num);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

}
