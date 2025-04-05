
class Student {
    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }
    public int getMarks() {
        return marks;
    }
    public String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Tom");
        s.setMarks(85);

        System.out.println("Student: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
        System.out.println("Grade: " + s.getGrade());
    }
}
