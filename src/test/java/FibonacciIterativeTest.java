import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciIterativeTest {
    private FibonacciIterative fib;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        fib = null;
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void main_EmptyString() {
        String[] args = new String[]{};
        FibonacciIterative.main(args);
        assertEquals("Enter the arguments\n", outContent.toString());
    }

    @Test
    void main_NonInteger() {
        String[] args = new String[]{"Kashaf"};
        FibonacciIterative.main(args);
        assertEquals("Invalid Input. Please enter a positive integer\n", outContent.toString());
    }

    @Test
    void main_Valid() {
        String[] args = new String[]{"23"};
        FibonacciIterative.main(args);
        assertEquals("F(23) = 28657\n", outContent.toString());
    }

    @Test
    void main_NegativeInteger() {
        String[] args = new String[]{"-1"};
        FibonacciIterative.main(args);
        assertEquals("Invalid Input. Please enter a positive integer\n", outContent.toString());
    }

    @Test
    void main_LargeInteger() {
        String[] args = new String[]{"47"};
        FibonacciIterative.main(args);
        assertEquals("Fibonacci number is too large for this input. Please enter a number less than 47!\n", outContent.toString());
    }

    @Test
    void FibonacciIterative_Negative() {
        assertThrows(InvalidInputException.class,
                () -> fib = new FibonacciIterative(-100));
    }

    @Test
    void FibonacciIterative_NegativeBoundary() {
        assertThrows(InvalidInputException.class,
                () -> fib = new FibonacciIterative(-1));
    }

    @Test
    void FibonacciIterative_LowerBoundary() throws InputMismatchException, InvalidInputException {
        fib = new FibonacciIterative(0);
        assertEquals("F(0) = 0\n", outContent.toString());
    }

    @Test
    void FibonacciIterative_MidRange() throws InputMismatchException, InvalidInputException {
        fib = new FibonacciIterative(23);
        assertEquals("F(23) = 28657\n", outContent.toString());
    }

    @Test
    void FibonacciIterative_UpperBoundary() throws InputMismatchException, InvalidInputException {
        fib = new FibonacciIterative(46);
        assertEquals("F(46) = 1836311903\n", outContent.toString());
    }

    @Test
    void FibonacciIterative_ExceedLimitBoundary() {
        assertThrows(InputMismatchException.class,
                () -> fib = new FibonacciIterative(47));
    }

    @Test
    void FibonacciIterative_ExceedLimit() {
        assertThrows(InputMismatchException.class,
                () -> fib = new FibonacciIterative(100));
    }
}
