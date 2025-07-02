import java.util.*;
public class CountTheOccurancesOfAnumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the number to count its occurrences: ");
        int num = sc.nextInt();
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        
        System.out.println("The number " + num + " occurs " + count + " times in the array.");
    }
}
