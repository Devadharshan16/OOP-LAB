
class Rectangle {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setWidth(3);

        System.out.println("Area of Rectangle: " + r.getArea());
    }
}
