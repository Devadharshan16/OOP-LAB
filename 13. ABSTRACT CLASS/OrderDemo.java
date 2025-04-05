abstract class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }

    abstract double applyDiscount();
    abstract String getType();

    void printFinalAmount() {
        double discount = applyDiscount();
        double finalAmount = amount - discount;
        System.out.println(getType() + " Order for " + customer + ": $" + finalAmount + " after discount of $" + discount);
    }
}

class RegularOrder extends Order {
    RegularOrder(String customer, double amount) {
        super(customer, amount);
    }

    double applyDiscount() {
        return amount > 1000 ? amount * 0.1 : amount * 0.05;
    }

    String getType() {
        return "Regular";
    }
}

class PremiumOrder extends Order {
    PremiumOrder(String customer, double amount) {
        super(customer, amount);
    }

    double applyDiscount() {
        return amount * 0.2;
    }

    String getType() {
        return "Premium";
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        Order regular = new RegularOrder("John", 1200);
        Order premium = new PremiumOrder("Alice", 1500);
        regular.printFinalAmount();
        premium.printFinalAmount();
    }
}