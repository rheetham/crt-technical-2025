import java.io.BufferedReader;
import java.io.InputStreamReader;

class StudentMarksMatrix {
    public static void main(String args[]) {
        int studentMarks[][] = new int[5][3];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; ++i) {
            System.out.println("Enter marks for 3 subjects for student " + (i + 1));

            try {
                for (int j = 0; j < 3; ++j) {
                    studentMarks[i][j] = Integer.parseInt(br.readLine());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 5; ++i) {
            System.out.println("Marks of student " + (i + 1));

            for (int j = 0; j < 3; ++j) {
                System.out.println(studentMarks[i][j]);
            }
        }
    }
}