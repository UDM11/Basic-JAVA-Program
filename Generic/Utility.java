public class Utility {

    public static <T> void printItem(T item) {
        System.out.println("Item: " + item);
    }

    public static void main(String[] args) {
        printItem("Hello");     // T becomes String
        printItem(123);         // T becomes Integer
        printItem(12.34);       // T becomes Double
    }
}
