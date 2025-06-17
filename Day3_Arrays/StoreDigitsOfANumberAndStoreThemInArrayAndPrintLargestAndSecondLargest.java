package Day3_Arrays;
import java.util.*;
public class StoreDigitsOfANumberAndStoreThemInArrayAndPrintLargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        
        // Convert the number to a string to easily access each digit
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        
        // Store each digit in the array
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        
        // Find the largest and second largest digits
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }
        
        System.out.println("Digits in the number: " + Arrays.toString(digits));
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
