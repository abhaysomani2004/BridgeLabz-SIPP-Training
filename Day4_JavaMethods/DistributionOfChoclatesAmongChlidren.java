package Day4_JavaMethods;
import java.util.*;
public class DistributionOfChoclatesAmongChlidren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of children");
        int n = sc.nextInt();
        System.out.println("Enter the number of chocolates");
        int m = sc.nextInt();
        int[] chocolates = distributeChocolates(n, m);
    }
    public static int[] distributeChocolates(int n, int m) {
        int[] chocolates = new int[n];
        for(int i = 0 ; i < n ; i++){
            chocolates[i] = m / n;
        }
        int remaining = m % n;
        for(int i = 0 ; i < remaining ; i++){
            chocolates[i]++;
        }
        System.out.println("Chocolates distributed among children:"  + Arrays.toString(chocolates));
        return chocolates;
    }
}