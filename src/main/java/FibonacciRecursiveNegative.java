public class FibonacciRecursiveNegative {
    private static final int MAX_N_VALUE = 46;
    private static final int MIN_N_VALUE = -46;

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int n = Integer.parseInt(args[0]);
                calculateAndPrintFibonacci(n);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer between -46 and 46!");
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Enter the arguments");
        }
    }

    public FibonacciRecursiveNegative(int n) throws InvalidInputException {
        if (n < MIN_N_VALUE || n > MAX_N_VALUE) {
            throw new InvalidInputException("Fibonacci number is too large for this input. Please enter an integer between -46 and 46!");
        }

        if (n < 0) {
            System.out.println("F(" + n + ") = " + calculateNegativeFibonacci(n));
        } else {
            System.out.println("F(" + n + ") = " + calculateFibonacci(n));
        }
    }

    private static void calculateAndPrintFibonacci(int n) throws InvalidInputException {
        try {
            new FibonacciRecursiveNegative(n);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    private int calculateNegativeFibonacci(int n) {
        // recursive algorithm for negative Fibonacci numbers
        if (n == 0) return 0;
        else if (n == -1) return 1;
        else return calculateNegativeFibonacci(n + 2) - calculateNegativeFibonacci(n + 1);
    }

    private int calculateFibonacci(int n) {
        // recursive algorithm for positive Fibonacci numbers
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return calculateFibonacci(n - 2) + calculateFibonacci(n - 1);
    }
}
