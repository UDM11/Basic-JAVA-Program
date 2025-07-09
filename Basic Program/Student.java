public class Student {
    private String name;
    private int rollNumber;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        setGrade(grade);
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

    public void setGrade(char grade) {
        if ("ABCDEF".indexOf(grade) >= 0) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade: " + grade + ". Grade not changed.");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, 'A');
        System.out.println("Name: " + student1.getName());
        System.out.println("Roll Number: " + student1.getRollNumber());
        System.out.println("Grade: " + student1.getGrade());

        student1.setGrade('G'); // Invalid
        System.out.println("Grade after invalid update: " + student1.getGrade());
    }
}
