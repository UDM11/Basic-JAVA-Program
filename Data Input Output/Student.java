// Define the Student class with encapsulation
public class Student {
    // Private fields
    private String name;
    private int rollNumber;
    private char grade;

    // Constructor to initialize name and rollNumber
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to set grade (only allows valid grades)
    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade! Grade must be A, B, C, D, or F.");
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public char getGrade() {
        return grade;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a student object
        Student student1 = new Student("Umesh Darlami", 101);

        // Set a valid grade
        student1.setGrade('A');

        // Try setting an invalid grade
        student1.setGrade('E');  // Should be rejected

        // Display student information
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Roll Number: " + student1.getRollNumber());
        System.out.println("Grade: " + student1.getGrade());
    }
}
