import java.util.Scanner;
public class EvenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Accept the size of the array
        System.out.print("Enter the number of elements (N): ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        // Accept array elements from the user
        System.out.println("Enter " + n + " integer numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int evenSum = 0, oddSum = 0;
        // Calculate sums
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        // Display results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        scanner.close();
    }
}
