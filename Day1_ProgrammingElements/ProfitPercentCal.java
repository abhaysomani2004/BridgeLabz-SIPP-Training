public class ProfitPercentCal {
    public static void main(String[] args) {
        int costPrice = 129; 
        int sellingPrice = 191; 
        int profit = sellingPrice - costPrice; 
        double profitPercent = (profit / (double) costPrice) * 100; 
        System.out.println("The profit percentage is: " + profitPercent + "%"); 
        System.out.println("The profit is: " + profit); 
    }
}
