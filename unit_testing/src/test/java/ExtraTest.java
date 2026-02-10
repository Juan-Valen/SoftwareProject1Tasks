
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ExtraTest extends AbstractParent {

    private static Calculator calculator = new Calculator();
    private final double DELTA = 0.001;

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

    @BeforeEach
    public void testReset() {
        System.out.println("  Reset calculator.");
        calculator.reset();
        assertEquals(0, calculator.getResult(), "Reset failed");
    }

    @ParameterizedTest(name = "The square of {0}")
    @CsvSource({ "2, 4", "4, 16", "5, 25" })
    public void testSquare(int number, Double result) {
        calculator.square(number);
        assertEquals(result, calculator.getResult(), "Squaring does not seem to work correctly");
    }

    @ParameterizedTest(name = "The square root of {0}")
    @CsvSource({ "2, 1.414", "-2, NaN" })
    public void testSquareRoot(int number, Double result) {
        calculator.squareRoot(number);
        assertEquals(result, calculator.getResult(), DELTA, "Squaring rooting does not seem to work correctly");
    }
}
