package testing;

import java.util.Scanner;

public class TemperatureConverter {
    double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    boolean isExtremeTemperature(double value) {
        return -40.0 > value || value > 50.0;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Choose option:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter 1 or 2: ");

        int choice = scanner.nextInt();
        System.out.print("Enter temperature value: ");
        double temp = scanner.nextDouble();
        double result;

        if (choice == 1) {
            result = converter.fahrenheitToCelsius(temp);
            System.out.printf("%.2f °F = %.2f °C%n", temp, result);
        } else if (choice == 2) {
            result = converter.celsiusToFahrenheit(temp);
            System.out.printf("%.2f °C = %.2f °F%n", temp, result);
        } else {
            System.out.println("Invalid option!");
            scanner.close();
            return;
        }

        if (converter.isExtremeTemperature(result)) {
            System.out.println("⚠️ Extreme temperature detected!");
        } else {
            System.out.println("Temperature is within normal range.");
        }

        scanner.close();
    }
}
