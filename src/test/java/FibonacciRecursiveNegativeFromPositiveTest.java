
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursiveNegativeFromPositiveTest {
    private FibonacciRecursiveNegativeFromPositive fib;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        fib = null;
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void main_EmptyString() {
        String[] args = new String[]{};
        FibonacciRecursiveNegativeFromPositive.main(args);
        assertEquals("Enter the arguments\n", outContent.toString());
    }

    @Test
    void main_NonInteger() {
        String[] args = new String[]{"abcd"};
        FibonacciRecursiveNegativeFromPositive.main(args);
        assertEquals("Invalid input. Please enter an integer between -46 and 46!\n", outContent.toString());
    }

    @Test
    void main_Valid() {
        String[] args = new String[]{"23"};
        FibonacciRecursiveNegativeFromPositive.main(args);
        assertEquals("F(23) = 28657\n", outContent.toString());
    }

    @Test
    void main_LargeNegativeInteger() {
        String[] args = new String[]{"-47"};
        FibonacciRecursiveNegativeFromPositive.main(args);
        assertEquals("Fibonacci number is too large for this input. Please enter an integer between -46 and 46!\n", outContent.toString());
    }

    @Test
    void main_LargePositiveInteger() {
        String[] args = new String[]{"47"};
        FibonacciRecursiveNegativeFromPositive.main(args);
        assertEquals("Fibonacci number is too large for this input. Please enter an integer between -46 and 46!\n", outContent.toString());
    }

    @Test
    void negativeFromPositive_Neg100() {
        assertThrows(InvalidInputException.class,
                () -> fib = new FibonacciRecursiveNegativeFromPositive(-100));
    }

    @Test
    void negativeFromPositive_Neg47() {
        assertThrows(InvalidInputException.class,
                () -> fib = new FibonacciRecursiveNegativeFromPositive(-47));
    }

    @Test
    void negativeFromPositive_Neg46() throws InvalidInputException {
        fib = new FibonacciRecursiveNegativeFromPositive(-46);
        assertEquals("F(-46) = -1836311903\n", outContent.toString());
    }

    @Test
    void negativeFromPositive_Neg23() throws InvalidInputException {
        fib = new FibonacciRecursiveNegativeFromPositive(-23);
        assertEquals("F(-23) = 28657\n", outContent.toString());
    }

    @Test
    void negativeFromPositive_Neg1() throws InvalidInputException {
        fib = new FibonacciRecursiveNegativeFromPositive(-1);
        assertEquals("F(-1) = 1\n", outContent.toString());
    }

    @Test
    void negativeFromPositive_Zero() throws InvalidInputException {
        fib = new FibonacciRecursiveNegativeFromPositive(0);
        assertEquals("F(0) = 0\n", outContent.toString());
    }

    @Test
    void negativeFromPositive_Pos23() throws InvalidInputException {
        fib = new FibonacciRecursiveNegativeFromPositive(23);
        assertEquals("F(23) = 28657\n", outContent.toString());
    }

    @Test
    void negativeFromPositive_Pos46() throws InvalidInputException {
        fib = new FibonacciRecursiveNegativeFromPositive(46);
        assertEquals("F(46) = 1836311903\n", outContent.toString());
    }

    @Test
    void negativeFromPositive_Pos47() {
        assertThrows(InvalidInputException.class,
                () -> fib = new FibonacciRecursiveNegativeFromPositive(47));
    }

    @Test
    void negativeFromPositive_Pos100() {
        assertThrows(InvalidInputException.class,
                () -> fib = new FibonacciRecursiveNegativeFromPositive(100));
    }
}
