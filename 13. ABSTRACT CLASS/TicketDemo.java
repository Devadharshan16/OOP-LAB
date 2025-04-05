abstract class Ticket {
    String passengerName;
    int distance;

    Ticket(String passengerName, int distance) {
        this.passengerName = passengerName;
        this.distance = distance;
    }

    abstract double calculateFare();
    abstract String getCategory();

    void printTicketDetails() {
        System.out.println(getCategory() + " Ticket for " + passengerName + ": $" + calculateFare());
    }
}

class BusTicket extends Ticket {
    BusTicket(String name, int distance) {
        super(name, distance);
    }

    double calculateFare() {
        return 2.0 + distance * 0.5;
    }

    String getCategory() {
        return "Bus";
    }
}

class TrainTicket extends Ticket {
    TrainTicket(String name, int distance) {
        super(name, distance);
    }

    double calculateFare() {
        return 5.0 + distance * 0.3;
    }

    String getCategory() {
        return "Train";
    }
}

public class TicketDemo {
    public static void main(String[] args) {
        Ticket bus = new BusTicket("Meena", 30);
        Ticket train = new TrainTicket("Vikram", 100);
        bus.printTicketDetails();
        train.printTicketDetails();
    }
}