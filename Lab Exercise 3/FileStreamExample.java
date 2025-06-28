import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {
        String message = "This is a file stream example";
        String filename = "file_io.txt";

        // Writing to the file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(message.getBytes());
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from the file using FileInputStream
        try (FileInputStream fis = new FileInputStream(filename)) {
            int ch;
            System.out.print("Data read from file: ");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println(); // for new line
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
