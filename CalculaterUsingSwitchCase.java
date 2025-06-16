import java.util.*;
public class CalculaterUsingSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = sc.nextDouble();  
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
            break;
            case '-':
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);   
            break;
            case '*':
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
            break;
            case '/':
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }   
            break;
            default:
            System.out.println("Error: Invalid operator. Please use +, -, *, or /.");   
            break;
        }
    }
}
