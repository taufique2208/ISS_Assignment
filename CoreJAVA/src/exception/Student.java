package exception;

public class Student {
    private String name;
    private int marks;

    public Student(String name) {
        this.name = name;
    }

    // Method that validates and throws custom exception
    public void setMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            // throw keyword to throw an exception manually
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}
