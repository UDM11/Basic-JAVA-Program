// ShoppingCart.java
public class ShoppingCart {

    // Method 1: Add one item by name
    public void addItem(String name) {
        System.out.println("Item added: " + name);
    }

    // Method 2: Add item by name and quantity
    public void addItem(String name, int quantity) {
        System.out.println("Item added: " + name);
        System.out.println("Quantity: " + quantity);
    }

    // Method 3: Add item by name, quantity, and price
    public void addItem(String name, int quantity, double price) {
        System.out.println("Item added: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per unit: $" + price);
        System.out.println("Total Price: $" + (quantity * price));
    }

    // Main method
    public static void main(String[] args) {
        // Create object of ShoppingCart
        ShoppingCart cart = new ShoppingCart();

        // Call overloaded methods
        cart.addItem("Apple");
        System.out.println();

        cart.addItem("Banana", 5);
        System.out.println();

        cart.addItem("Orange", 3, 20.5);
    }
}
