import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

class Student {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public Student(String name, int... marks) {
        this.name = name;
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        int max = -2147483648;
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    public int getMinimumMark() {
        int min = 2147483647;
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

    public String toString() {
        return name + marks;
    }

    public void addNewMark(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }
}