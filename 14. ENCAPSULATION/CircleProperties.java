
class Circle {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleProperties {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(4.5);

        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
    }
}
