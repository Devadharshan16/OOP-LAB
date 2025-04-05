class ExamDetails {
    int[] marks;

    ExamDetails(int[] marks) {
        this.marks = marks;
    }
}

class ResultAnalyzer extends ExamDetails {
    ResultAnalyzer(int[] marks) {
        super(marks);
    }

    void evaluate() {
        boolean pass = true;
        int total = 0;
        for (int mark : marks) {
            if (mark < 35) {
                pass = false;
            }
            total += mark;
        }
        double average = total / (double) marks.length;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + (pass ? "Pass" : "Fail"));
    }
}

public class ExamResultSystem {
    public static void main(String[] args) {
        int[] marks = { 78, 85, 90, 33, 60 };
        ResultAnalyzer re = new ResultAnalyzer(marks);
        re.evaluate();
    }
}