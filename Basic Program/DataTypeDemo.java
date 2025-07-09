public class DataTypeDemo {

    public static void main(String[] args) {
        // Declare and initialize variables of different types
        int myInt = 10;
        double myDouble = 5.5;
        char myChar = 'A';
        boolean myBool = true;
        String myString = "Hello, Java!";

        // Perform arithmetic operations
        int sumInt = myInt + 5;
        double subDouble = myDouble - 2.2;

        // Print arithmetic results
        System.out.println("Integer after addition: " + sumInt);
        System.out.println("Double after subtraction: " + subDouble);

        // Use relational operators
        System.out.println("Is myInt > myDouble? " + (myInt > myDouble));
        System.out.println("Is myInt == 10? " + (myInt == 10));

        // Create an array and initialize it
        int[] numbers = {2, 4, 6, 8, 10};

        // Calculate the sum of elements using a loop
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        // Check if the sum is even or odd
        if (total % 2 == 0) {
            System.out.println("Sum of array elements is even: " + total);
        } else {
            System.out.println("Sum of array elements is odd: " + total);
        }

        // Print each element of the array
        System.out.println("Elements of the array:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
