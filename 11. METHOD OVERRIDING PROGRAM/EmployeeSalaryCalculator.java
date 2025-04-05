abstract class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();

    void showDetails() {
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name) {
        super(name);
    }

    @Override
    void calculateSalary() {
        System.out.println(name + "'s salary is calculated monthly.");
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name) {
        super(name);
    }

    @Override
    void calculateSalary() {
        System.out.println(name + "'s salary is calculated hourly.");
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Alice");
        Employee e2 = new PartTimeEmployee("Bob");

        e1.showDetails();
        e1.calculateSalary();

        e2.showDetails();
        e2.calculateSalary();
    }
}