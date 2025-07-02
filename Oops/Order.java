package Oops;

public class Order extends OopsMainClass {
    int orderId;
    String orderDate;
    int orderTotal;

    Order(int orderId, String orderDate, int orderTotal) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderTotal = orderTotal;
    }

    
    void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Total: " + orderTotal);
    }
}
