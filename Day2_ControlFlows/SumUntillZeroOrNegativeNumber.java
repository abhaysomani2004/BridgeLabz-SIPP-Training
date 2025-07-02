package Day2_ControlFlows;
import java.util.*;
public class SumUntillZeroOrNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.println("Enter numbers to sum (enter 0 or a negative number to stop):");  
        while (true) {
            double number = sc.nextDouble();
            if (number <= 0) { 
                break; 
            }
            sum += number; 
        }
        System.out.println("The total sum is: " + sum); 
    }
    
}
