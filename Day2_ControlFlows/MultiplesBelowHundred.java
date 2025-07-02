package Day2_ControlFlows;
import java.util.*;
public class MultiplesBelowHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 100; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
            if(n > 100){
               System.out.println("Please enter a number below 100");
            }
        }
        System.out.println("Multiples of " + n + " below 100 are:");
    }
}
