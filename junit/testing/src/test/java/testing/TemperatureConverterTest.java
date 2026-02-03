package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
    TemperatureConverter tempConv = new TemperatureConverter();

    @DisplayName("fahrenheitToCelsius")
    @Test
    void fahrenheitToCelsius() {
        assertEquals(tempConv.fahrenheitToCelsius(5.00d), -15.00d);
        assertEquals(tempConv.fahrenheitToCelsius(32.00d), 0.00d);
        assertEquals(tempConv.fahrenheitToCelsius(41.00d), 5.00d);
    }

    @DisplayName("celsiusToFahrenheit")
    @Test
    void celsiusToFahrenheit() {
        assertEquals(tempConv.celsiusToFahrenheit(5.00d), 41.00d);
        assertEquals(tempConv.celsiusToFahrenheit(0.00d), 32.00d);
        assertEquals(tempConv.celsiusToFahrenheit(-35.00d), -31.00d);
    }

    @DisplayName("isExtremeTemperature")
    @Test
    void isExtremeTemperature() {
        assertTrue(tempConv.isExtremeTemperature(-41.0));
        assertTrue(tempConv.isExtremeTemperature(51.0));
        assertFalse(tempConv.isExtremeTemperature(-20.0));
        assertFalse(tempConv.isExtremeTemperature(20.0));
        assertFalse(tempConv.isExtremeTemperature(0.0));
    }
}
