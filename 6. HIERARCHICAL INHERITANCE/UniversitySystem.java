class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private String studentId;
    private String course;

    public Student(String name, int age, String studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    public void displayStudentDetails() {
        displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

class Professor extends Person {
    private String employeeId;
    private String department;

    public Professor(String name, int age, String employeeId, String department) {
        super(name, age);
        this.employeeId = employeeId;
        this.department = department;
    }

    public void displayProfessorDetails() {
        displayDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "S12345", "Computer Science");
        Professor professor = new Professor("Dr. Smith", 45, "P67890", "Mathematics");

        System.out.println("Student Details:");
        student.displayStudentDetails();

        System.out.println("\nProfessor Details:");
        professor.displayProfessorDetails();
    }
}
