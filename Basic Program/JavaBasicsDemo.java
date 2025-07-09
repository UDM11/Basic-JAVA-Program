public class JavaBasicsDemo {
    public static void main(String[] args) {
        
        // 1. DATA TYPES & VARIABLES
        int age = 25; // integer type
        double salary = 55000.50; // floating-point type
        char grade = 'A'; // character type
        boolean isEmployed = true; // boolean type
        String name = "Alice"; // string (object type)

        // 2. OPERATORS
        int a = 10;
        int b = 5;
        int sum = a + b; // addition
        int diff = a - b; // subtraction
        int product = a * b; // multiplication
        int quotient = a / b; // division
        int remainder = a % b; // modulus
        boolean isEqual = (a == b); // comparison
        boolean logical = (a > b) && (b > 0); // logical AND

        // 3. ARRAYS
        int[] numbers = {10, 20, 30, 40, 50}; // array declaration
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 4. CONTROL STRUCTURES
        System.out.println("\nControl Structures:");

        // if-else
        if (age >= 18) {
            System.out.println(name + " is an adult.");
        } else {
            System.out.println(name + " is not an adult.");
        }

        // switch
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good.");
                break;
            default:
                System.out.println("Needs improvement.");
        }

        // for loop
        System.out.println("For loop from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "\n");
        }

        // while loop
        System.out.println("\nWhile loop example:");
        int counter = 0;
        while (counter < 3) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        // do-while loop
        System.out.println("Do-while loop example:");
        int j = 0;
        do {
            System.out.println("j: " + j);
            j++;
        } while (j < 3);
    }
}
