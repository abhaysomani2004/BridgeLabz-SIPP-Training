import java.util.*;
public class SideOfaSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paarameter = sc.nextInt();
        if (paarameter <= 0) {
            System.out.println("Error: Parameter must be a positive integer.");
        } else {
            double side = paarameter / 4.0;
            System.out.printf("The side of the square is: %.2f sq cm%n", side);
        }
    }
}
