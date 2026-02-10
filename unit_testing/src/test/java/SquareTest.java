import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class SquareTest {

    private static Calculator calculator = new Calculator();

    @BeforeAll
    public static void testPowerOn() {
        System.out.println("@BeforeAll Power ON (before the first test)");
        calculator.powerOn();
    }

    @AfterAll
    public static void testPowerOff() {
        System.out.println("@AfterAll Power OFF (all tests executed).");
        calculator.powerOff();
    }

    @ParameterizedTest(name = "The square of {0} is {1}")
    @CsvSource({ "0, 0", "1, 1", "2, 4", "4, 16", "5, 25", "6, 36" })
    public void testSquare(int number, int result) {
        calculator.square(number);
        assertEquals(result, calculator.getResult(), "Squaring does not seem to work correctly");
    }
}
