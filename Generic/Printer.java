public class Printer {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        String[] names = {"Ram", "Sita"};

        printArray(nums);   // Prints: 1 2 3
        printArray(names);  // Prints: Ram Sita
    }
}
