import java.util.InputMismatchException;

public class FibonacciIterative {

    private static final int MAX_N_VALUE = 46;

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int n = Integer.parseInt(args[0]);
                new FibonacciIterative(n);
            } catch (NumberFormatException | InvalidInputException e) {
                System.out.println("Invalid Input. Please enter a positive integer");
            } catch (InputMismatchException  e) {
                System.out.println("Fibonacci number is too large for this input. Please enter a number less than 47!");
            }
        } else {
            System.out.println("Enter the arguments");
        }
    }

    public FibonacciIterative(int n) throws InvalidInputException {
        validateInput(n);
        System.out.println("F(" + n + ") = " + fibonacci(n));
    }
    private void validateInput(int n) throws InputMismatchException, InvalidInputException {
        if (n < 0) {
            throw new InvalidInputException();
        }
        if (n > MAX_N_VALUE) {
            throw new InputMismatchException();
        }

    }


    private int fibonacci(int n) {

        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            int fibEven=0;
            int fibOdd=1;
            int result=1;
            for (int i=1; i<=n; i++) {
                try {
                    Math.multiplyExact(fibEven, fibOdd);
                } catch (ArithmeticException e) {
                    throw e;
                }
                result = fibEven + fibOdd;
                if (i%2 == 1)
                    fibOdd = result;
                else
                    fibEven = result;
            }
            return result;
        }
    }
}
