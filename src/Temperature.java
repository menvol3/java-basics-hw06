import java.util.Scanner;

public class Temperature {

    /**
     * Converts temperature from Fahrenheit to Celsius degree.
     *
     * @param fahrenheit temperature degree in Fahrenheit
     * @return temperature degree in Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        double C = 5 * (fahrenheit - 32) / 9;
        return C;
    }

    /**
     * Converts temperature from Celsiusto Fahrenheit degree.
     *
     * @param celsius temperature degree in Celsius
     * @return temperature degree in Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        double F = (9 * celsius + 160) / 5;
        return F;
    }
}
