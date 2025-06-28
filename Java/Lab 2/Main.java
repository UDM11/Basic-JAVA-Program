class Student {
    private String name;
    private int rollNumber;
    private char grade;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F') {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade entered. Grade must be A, B, C, D, or F.");
        }
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public char getGrade() {
        return grade;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Umesh Darlami", 101);
       
        student1.setGrade('A');
       
        student1.displayStudentInfo();
    }
}