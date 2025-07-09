public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // ArithmeticException
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        // ArrayIndexOutOfBoundsException
        int[] numbers = new int[5];

        try {
            System.out.println("Accessing 6th element: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }

        // Final message
        System.out.println("Program continues...");
    }
}
