package Day3_Arrays;
import java.util.*;
public class Two_DArrayTempratureInputAndReturnTheColdestDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] temp = new int[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1);
            temp[i][0] = i + 1;
            temp[i][1] = sc.nextInt();
        }
        int cldIdx = 0;
        for (int i = 1; i < n; i++) {
            if (temp[i][1] < temp[cldIdx][1]) {
                cldIdx = i;
            }
        }
        System.out.println("Coldest day is Day " + temp[cldIdx][0] + " with temperature " + temp[cldIdx][1]);
    }
}
