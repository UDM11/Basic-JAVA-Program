import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataIOExample {
    public static void main(String[] args) {
        String filename = "data_io.bin";

        // Data to write
        int number = 42;
        double price = 99.99;
        boolean isAvailable = true;

        // Writing data to file using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(number);
            dos.writeDouble(price);
            dos.writeBoolean(isAvailable);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading data from file using DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            int readNumber = dis.readInt();
            double readPrice = dis.readDouble();
            boolean readAvailability = dis.readBoolean();

            System.out.println("Data read from file:");
            System.out.println("Integer: " + readNumber);
            System.out.println("Double: " + readPrice);
            System.out.println("Boolean: " + readAvailability);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
