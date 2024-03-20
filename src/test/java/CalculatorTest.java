import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        Assertions.assertEquals(3, calculator.add(1, 2), "1 + 2 should equal 3");
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(1, calculator.subtract(4, 3), "4 - 3 should equal 1");
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(20, calculator.multiply(5, 4), "5 * 4 should equal 20");
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(7, calculator.divide(14, 2), "14 / 2 should equal 7");
    }

    @Test
    void testDivideFloatingPointResult() {
        Assertions.assertEquals(3.8, calculator.divide(19, 5), "19 / 5 should equal 3.8");
    }

    @Test
    void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(8, 0),
            "Dividing by zero should throw IllegalArgumentException");
    }
}
