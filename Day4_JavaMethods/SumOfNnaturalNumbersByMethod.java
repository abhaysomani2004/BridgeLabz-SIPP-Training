package Day4_JavaMethods;
import java.util.*;
public class SumOfNnaturalNumbersByMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to find the sum of natural numbers");
        int n  = sc.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
    public static int sumOfNaturalNumbers(int n){
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += i + 1;
        }
        return sum;
    }
}
