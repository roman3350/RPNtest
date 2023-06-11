import org.junit.jupiter.api.*;

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        Assertions.assertEquals(8 , reversePolishNotationCalculator.calculatePolishNotation("4 4 +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        Assertions.assertEquals(0 , reversePolishNotationCalculator.calculatePolishNotation("4 4 -"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        Assertions.assertEquals(16 , reversePolishNotationCalculator.calculatePolishNotation("4 4 *"));
    }

    @Test
    public void shouldCalculateNegativeNumbers() {
        Assertions.assertEquals(-6 , reversePolishNotationCalculator.calculatePolishNotation("4 10 -"));
    }

    @Test
    public void shouldCalculateSpaces() {
        Assertions.assertEquals(9 , reversePolishNotationCalculator.calculatePolishNotation(" 4     5  + "));
    }
}