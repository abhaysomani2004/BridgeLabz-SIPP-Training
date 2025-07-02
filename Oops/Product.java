package Oops;

public class Product extends OopsMainClass {
    public int productId;
    public String productName;
    
    void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
    }
    Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}
