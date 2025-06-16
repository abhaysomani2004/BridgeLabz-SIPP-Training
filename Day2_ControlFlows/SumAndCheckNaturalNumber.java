package Day2_ControlFlows;
import java.util.*;
public class SumAndCheckNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        if(n < 0){
            System.out.println("Please enter a natural number");
        }
        if( n > 0 ){
            for(int i = 1; i <= n; i++) {
                sum += i;
            }
        System.out.println("n is a natural number and its sum natural numbers is: " + sum);
        }
    }
}
