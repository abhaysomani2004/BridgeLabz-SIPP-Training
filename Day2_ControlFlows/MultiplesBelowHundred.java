package Day2_ControlFlows;
import java.util.*;
public class MultiplesBelowHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Multiples of " + n + " below 100 are:");
        for (int i = 1; i < 100; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
