import java.util.InputMismatchException;

public class FibonacciRecursive {
    private static final int MAX_N_VALUE = 46;

    public static void main(String[] args) {

        if (args.length > 0) {
            try {
                int n = Integer.parseInt(args[0]);
                new FibonacciRecursive(n);

            } catch (InvalidInputException | NumberFormatException e) {
                System.out.println("Invalid Input. Please enter a positive integer");
            }
            catch ( InputMismatchException e) {
                System.out.println("Fibonacci number is too large for this input. Please enter a number less than 47!");
            }
        } else System.out.println("Enter the arguments");
    }
    public FibonacciRecursive(int n) throws InputMismatchException, InvalidInputException {
        validateInput(n);
        System.out.println("F(" + n + ") = " + calculateFibonacci(n));
    }

    private void validateInput(int n) throws InputMismatchException, InvalidInputException {
        if (n < 0) {
            throw new InvalidInputException();
        }
        if (n > MAX_N_VALUE) {
            throw new InputMismatchException();
        }

    }

    private int calculateFibonacci(int n) {
        // Recursive algorithm
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return calculateFibonacci(n - 2) + calculateFibonacci(n - 1);
    }

}
