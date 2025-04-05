
class Temperature {
    private double celsius;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    public double getFahrenheit() {
        return (celsius * 9/5) + 32;
    }
}

public class TemperatureConverter {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.setCelsius(25);

        System.out.println("Temperature in Fahrenheit: " + temp.getFahrenheit());
    }
}
