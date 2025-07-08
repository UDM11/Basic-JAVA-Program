public class DisplayData {
    
    // Generic constructor
    public <T> DisplayData(T data) {
        System.out.println("Value: " + data);
        System.out.println("Type: " + data.getClass().getSimpleName());
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating objects with different data types
        DisplayData intData = new DisplayData(100);
        DisplayData doubleData = new DisplayData(99.99);
        DisplayData stringData = new DisplayData("Hello World");
        DisplayData charData = new DisplayData('A');
    }
}
