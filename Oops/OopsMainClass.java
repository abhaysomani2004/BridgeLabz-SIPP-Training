package Oops;

public class OopsMainClass {

    public static void main(String[] args) {
        // Create instances of Product and Customer
        Product product1 = new Product(1, "Laptop");
        product1.displayProductDetails();

        Custmor customer1 = new Custmor(1, "John Doe", "asdfhdfghj@gmail.com");
        customer1.displayCustomerDetails(); 
        Custmor customer2 = new Custmor();
        customer2.displayCustomerDetails();
        Order order1 = new Order( 101, "2023-10-01", 25000);
        order1.displayOrderDetails();
        }
    // This is the main method where the program execution starts
    // It creates instances of Product and Customer classes and displays their details
    }
// The OopsMainClass serves as the entry point for the application, demonstrating the use of Product and Custmor classes
// It creates instances of these classes and calls their methods to display product and customer details