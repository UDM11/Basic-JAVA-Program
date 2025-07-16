class Printer {
    public static <T> void print(T value) {
        System.out.println("Printing: " + value);
    }
}

public class Printers {
    public static void main(String[] args) {
        Printer.print("Hello");
        Printer.print(123);
        Printer.print(99.9);
    }
}
