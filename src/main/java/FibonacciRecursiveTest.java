import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciRecursiveTest {
    private FibonacciRecursive fib;
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
        FibonacciRecursive.main(args);
        assertEquals("Enter the arguments\n", outContent.toString());
    }

    @Test
    void main_NonInteger() {
        String[] args = new String[]{"Kashaf"};
        FibonacciRecursive.main(args);
        assertEquals("Invalid Input. Please enter a positive integer\n", outContent.toString());
    }

    @Test
    void main_Valid() {
        String[] args = new String[]{"23"};
        FibonacciRecursive.main(args);
        assertEquals("F(23) = 28657\n", outContent.toString());
    }

    @Test
    void main_NegativeInteger() {
        String[] args = new String[]{"-1"};
        FibonacciRecursive.main(args);
        assertEquals("Invalid Input. Please enter a positive integer\n", outContent.toString());
    }

    @Test
    void main_LargeInteger() {
        String[] args = new String[]{"47"};
        FibonacciRecursive.main(args);
        assertEquals("Fibonacci number is too large for this input. Please enter a number less than 47!\n", outContent.toString());
    }

    @Test
    void FibonacciRec_Negative() {
        assertThrows(InvalidInputException.class,
                () -> fib = new FibonacciRecursive(-100));
    }

    @Test
    void FibonacciRec_NegativeBoundary() {
        assertThrows(InvalidInputException.class,
                () -> fib = new FibonacciRecursive(-1));
    }

    @Test
    void FibonacciRec_LowerBoundary() throws InputMismatchException, InvalidInputException {
        fib = new FibonacciRecursive(0);
        assertEquals("F(0) = 0\n", outContent.toString());
    }

    @Test
    void FibonacciRec_MidRange() throws InputMismatchException, InvalidInputException {
        fib = new FibonacciRecursive(23);
        assertEquals("F(23) = 28657\n", outContent.toString());
    }

    @Test
    void FibonacciRec_UpperBoundary() throws InputMismatchException, InvalidInputException {
        fib = new FibonacciRecursive(46);
        assertEquals("F(46) = 1836311903\n", outContent.toString());
    }

    @Test
    void FibonacciRec_ExceedLimitBoundary() {
        assertThrows(InputMismatchException.class,
                () -> fib = new FibonacciRecursive(47));
    }

    @Test
    void FibonacciRec_ExceedLimit() {
        assertThrows(InputMismatchException.class,
                () -> fib = new FibonacciRecursive(100));
    }
}
