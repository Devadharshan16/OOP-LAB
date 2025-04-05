class BaseOrder {
    int orderId;
    String customer;

    BaseOrder(int orderId, String customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    void showOrder() {
        System.out.println("Order #" + orderId + " for " + customer);
    }
}

class ShippingOrder extends BaseOrder {
    int retryCount = 0;

    ShippingOrder(int orderId, String customer) {
        super(orderId, customer);
    }

    void checkShippingStatus() {
        while (retryCount < 3) {
            retryCount++;
            if (Math.random() > 0.5) {
                System.out.println("Shipping successful on attempt " + retryCount);
                return;
            } else {
                System.out.println("Shipping failed. Retrying... (" + retryCount + ")");
            }
        }
        System.out.println("Shipping failed after 3 attempts for Order #" + orderId);
    }
}

class DeliveredOrder extends BaseOrder {
    int deliveryDays;

    DeliveredOrder(int orderId, String customer, int deliveryDays) {
        super(orderId, customer);
        this.deliveryDays = deliveryDays;
    }

    void deliveryStatus() {
        if (deliveryDays <= 3) {
            System.out.println("Delivered on time.");
        } else if (deliveryDays <= 7) {
            System.out.println("Delivered with delay.");
        } else {
            System.out.println("Delivery took too long. Escalate.");
        }
    }
}

public class OrderProcessingSystem {
    public static void main(String[] args) {
        new ShippingOrder(201, "John").checkShippingStatus();
        new DeliveredOrder(202, "Mary", 8).deliveryStatus();
    }
}