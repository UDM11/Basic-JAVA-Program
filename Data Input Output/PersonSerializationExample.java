import java.io.*;

// Serializable Person class
class Person implements Serializable {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display data
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonSerializationExample {
    public static void main(String[] args) {
        String filename = "person.obj";

        // Create a Person object
        Person person = new Person("John Doe", 30);

        // Serialize (write) the object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Person object written to file.");
        } catch (IOException e) {
            System.out.println("Error writing object: " + e.getMessage());
        }

        // Deserialize (read) the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Person readPerson = (Person) ois.readObject();
            System.out.println("Person object read from file:");
            readPerson.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading object: " + e.getMessage());
        }
    }
}
