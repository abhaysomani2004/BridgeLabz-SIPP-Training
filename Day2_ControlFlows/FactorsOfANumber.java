package Day2_ControlFlows;
import java.util.*;
public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factors:");
        int number = sc.nextInt();
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // Check if 'i' is a factor of 'number'
                System.out.print(i + " "); // Print the factor
            }
        }
    }
}
