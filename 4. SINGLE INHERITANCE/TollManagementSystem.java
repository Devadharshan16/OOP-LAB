class TollBoothManager {
    int calculateToll(int distance, String vehicleType) {
        int rate;
        if (vehicleType.equalsIgnoreCase("car")) {
            rate = 5;
        } else if (vehicleType.equalsIgnoreCase("truck")) {
            rate = 10;
        } else {
            rate = 3;
        }
        return distance * rate;
    }
}

class TollFeeCalculator extends TollBoothManager {
    void processToll(String vehicleType, int distance) {
        int total = calculateToll(distance, vehicleType);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Toll: $" + total);
    }
}

public class TollManagementSystem {
    public static void main(String[] args) {
        TollFeeCalculator tc = new TollFeeCalculator();
        tc.processToll("truck", 15);
    }
}