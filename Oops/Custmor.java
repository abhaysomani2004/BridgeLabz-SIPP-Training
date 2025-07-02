package Oops;

public class Custmor {
    public int CustmorId;
    public String CustmorName;
    public String emaild;

    public Order [] orders = new Order[10]; // Array to hold orders, assuming a maximum of 10 orders

    void displayCustomerDetails() {
        System.out.println("Customer ID: " + CustmorId);
        System.out.println("Customer Name: " + CustmorName);
        System.out.println("Customer Email: " + emaild);
    }
     Custmor (int CustmorId, String CustmorName, String emaild) {
        this.CustmorId = CustmorId;
        this.CustmorName = CustmorName;
        this.emaild = emaild;
     }
      



     Custmor() {
        // Default constructor
     }
}
