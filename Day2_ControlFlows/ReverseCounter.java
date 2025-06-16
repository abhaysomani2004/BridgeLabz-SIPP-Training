package Day2_ControlFlows;
import java.util.*;
public class ReverseCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of starting point: ");
        int counttedValue = sc.nextInt();
        if (counttedValue < 0) {
            System.out.println("Please enter a valiid number");
        } else {
            System.out.println("Counting down from " + counttedValue + " to 1:");
            for (int i = counttedValue; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println(); 
        }
    }
}
