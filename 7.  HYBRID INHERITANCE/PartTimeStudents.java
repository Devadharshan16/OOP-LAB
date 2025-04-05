import java.util.Scanner;

interface Person {
    void inputPersonDetails();
    void displayPersonDetails();
}

class Student implements Person {
    protected String name;
    protected int age;
    protected int marks;

    @Override
    public void inputPersonDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter marks: ");
        marks = sc.nextInt();
    }

    @Override
    public void displayPersonDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}

class Employee implements Person {
    protected String name;
    protected int age;
    protected int salary;

    @Override
    public void inputPersonDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter salary: ");
        salary = sc.nextInt();
    }

    @Override
    public void displayPersonDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}

class PartTimeStudent extends Student {
    private int salary;

    public void inputDetails() {
        super.inputPersonDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        salary = sc.nextInt();
    }

    public void displayDetails() {
        super.displayPersonDetails();
        System.out.println("Salary: " + salary);
    }
}

public class PartTimeStudents{
    public static void main(String[] args) {
        PartTimeStudent pts = new PartTimeStudent();
        pts.inputDetails();

        System.out.println("\nDetails of Part-Time Student:");
        pts.displayDetails();
    }
}
