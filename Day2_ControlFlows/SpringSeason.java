package Day2_ControlFlows;
import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int month = sc.nextInt();
        System.out.println("Enter the day number");
        int day = sc.nextInt();
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day < 21)) {
            System.out.println("It is Spring season.");
        } else {
            System.out.println("It is not Spring season.");
        }
    }
}
