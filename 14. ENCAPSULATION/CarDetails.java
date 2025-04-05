
class Car {
    private String model;
    private int year;
    private double mileage;

    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getMileage() {
        return mileage;
    }
}

public class CarDetails {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("Toyota Corolla");
        c.setYear(2020);
        c.setMileage(25000.5);

        System.out.println("Model: " + c.getModel());
        System.out.println("Year: " + c.getYear());
        System.out.println("Mileage: " + c.getMileage() + " km");
    }
}
