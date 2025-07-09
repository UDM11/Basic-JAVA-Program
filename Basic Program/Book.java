// Define a class called Book
public class Book {
    // Instance variables to store title and author
    String title;
    String author;

    // Method to display book information
    void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
    }

    // Main method
    public static void main(String[] args) {
        // Create a Book object
        Book myBook = new Book();

        // Set properties for the book
        myBook.title = "Java Programming Basics";
        myBook.author = "John Smith";

        // Display book information
        myBook.displayBookInfo();
    }
}
