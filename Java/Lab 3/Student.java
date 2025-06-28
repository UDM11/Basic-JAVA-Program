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
        if (grade == 'A' || grade == 'B' || grade == 'C' ||
            grade == 'D' || grade == 'E' || grade == 'F') {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade: " + grade + ". Grade not changed.");
        }
    }
}
