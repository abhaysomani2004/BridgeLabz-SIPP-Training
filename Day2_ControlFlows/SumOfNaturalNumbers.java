package Day2_ControlFlows;
import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a valid Natural Number.");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int formulaSum = n * (n + 1) / 2;
        if (sum == formulaSum) {
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }
}
