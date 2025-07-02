package Day4_JavaMethods;
import java.util.*;
public class WindChillTempAndSpeedCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        double temperature = sc.nextDouble();
        System.out.println("Enter the wind speed in miles per hour:");
        double windSpeed = sc.nextDouble();
        
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.printf("The wind chill is: %.2f degrees Fahrenheit%n", windChill);
    }
    public static double calculateWindChill(double temperature, double windSpeed) {
        if (temperature < 50 && windSpeed > 3) {
            return 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        } else {
            return temperature;
        }
    }
}
