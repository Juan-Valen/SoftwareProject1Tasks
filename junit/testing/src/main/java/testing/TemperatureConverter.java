package testing;

public class TemperatureConverter
{
    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32)*5/9;
    }

    double celsiusToFahrenheit(double celsius) {
        return celsius*9/5+32;
    }

    boolean isExtremeTemperature(double value) {
        return -40.0 > value || value > 50.0;
    }
}
