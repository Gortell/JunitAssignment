import Assignment1.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestCalculator {
    @Test
    @DisplayName("Calculate multiply formula")
    void testCalculateMultiply() {
        double result = Calculator.calculateMultiply(1.0, 4.0);
        assertEquals(4.0, result);
    }

    @Test
    @DisplayName("Test division")
    void testCalculateDivide() {
        double result = Calculator.calculateDivide(20.0, 5.0);
        assertEquals(4.0, result);
        assertThrows(ArithmeticException.class, () -> Calculator.calculateDivide(20.0, 0.0));
    }

    @Test
    @DisplayName("Test sum")
    void testCalculateSum() {
        double result = Calculator.calculateSum(100.0, 50.0);
        assertEquals(150.0, result);
    }

    @Test
    @DisplayName("Test subtraction")
    void testCalculateSubtract() {
        double result = Calculator.calculateSubtract(300.0, 100.0);
        assertEquals(200.0, result);
    }
}



