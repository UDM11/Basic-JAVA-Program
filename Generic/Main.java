// Generic Box class
class Box<T> {
    private T value;

    // Method to set the value
    public void setValue(T value) {
        this.value = value;
    }

    // Method to get the value
    public T getValue() {
        return value;
    }

    // Method to display the type of the object
    public void displayType() {
        System.out.println("Stored value: " + value);
        System.out.println("Type: " + value.getClass().getSimpleName());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Test with Integer
        Box<Integer> intBox = new Box<>();
        intBox.setValue(123);
        intBox.displayType();

        // Test with String
        Box<String> strBox = new Box<>();
        strBox.setValue("Hello, Generics!");
        strBox.displayType();
    }
}
