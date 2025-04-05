import java.util.Scanner;

interface Shape {
    void inputDimensions();
}

class Rectangle implements Shape {
    protected int length, breadth;

    @Override
    public void inputDimensions() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        length = sc.nextInt();
        breadth = sc.nextInt();
    }

    public int calculateArea() {
        return length * breadth;
    }
}

class Triangle implements Shape {
    protected int base, height;

    @Override
    public void inputDimensions() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and height: ");
        base = sc.nextInt();
        height = sc.nextInt();
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class ShapeAreaCalculator extends Rectangle {
    private Triangle triangle = new Triangle();

    public void inputAllDimensions() {
        super.inputDimensions();
        triangle.inputDimensions();
    }

    public void displayAreas() {
        System.out.println("Rectangle Area: " + super.calculateArea());
        System.out.println("Triangle Area: " + triangle.calculateArea());
    }
}

public class ShapeAreaCalculators{
    public static void main(String[] args) {
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();
        calculator.inputAllDimensions();

        System.out.println("\nCalculating Areas:");
        calculator.displayAreas();
    }
}
