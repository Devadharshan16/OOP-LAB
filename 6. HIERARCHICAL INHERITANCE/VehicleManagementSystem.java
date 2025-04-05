class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate(int amount) {
        speed += amount;
        System.out.println(brand + " is now going at " + speed + " km/h");
    }
}

class Car extends Vehicle {
    protected String fuelType;

    public Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    public void refuel() {
        System.out.println(brand + " is refueled with " + fuelType);
    }
}

class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String brand, int speed, String fuelType, int batteryLevel) {
        super(brand, speed, fuelType);
        this.batteryLevel = batteryLevel;
    }

    public void chargeBattery(int amount) {
        batteryLevel = Math.min(batteryLevel + amount, 100);
        System.out.println(brand + " battery charged to " + batteryLevel + "%");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla Model 3", 0, "Electric", 80);
        tesla.accelerate(50);
        tesla.chargeBattery(15);
        tesla.refuel();
    }
}